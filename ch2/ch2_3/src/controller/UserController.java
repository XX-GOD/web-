package controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.UserForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Controller
@RequestMapping("/user")
public class UserController {
    private static final Log logger = LogFactory.getLog(UserController.class);
    @PostMapping("/login")
    public String login(UserForm user, HttpSession session, Model model) {
        if("zhangsan".equals(user.getUname())&&"123456".equals(user.getUpass())){
            session.setAttribute("u", user);
            logger.info("成功");
            return "main";
        }else{
            logger.info("失败");
            model.addAttribute("messageError","用户名或密码错误");
            return "login";
        }
    }
    @PostMapping("/register")
    public String register(UserForm user, Model model) {
        if("zhangsan".equals(user.getUname())&&"123456".equals(user.getUpass())){
            logger.info("成功");
            return "login";
        }else{
            logger.info("失败");
            model.addAttribute("uname",user.getUname());
            return "register";
        }
    }
}
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Person;

import java.util.*;

@Controller
public class TestController {
    @RequestMapping("/testJson")
    @ResponseBody
    public List<Map<String, Object>> testJson(@RequestBody Person user) {
        System.out.println("pname=" + user.getPname()+",password=" + user.getPassword()+",page=" + user.getPage());
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("pname", "陈恒2");
        map.put("password", "123456");
        map.put("page", 25);
        List<Map<String,Object>> allp=new ArrayList<Map<String, Object>>();
        allp.add(map);
        Map<String,Object> map1=new HashMap<String, Object>();
        map1.put("pname","陈恒3");
        map1.put("password","54321");
        map1.put("page",55);
        allp.add(map1);
        return allp;
    }
}

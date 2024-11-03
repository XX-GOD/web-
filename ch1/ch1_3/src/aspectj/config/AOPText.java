package aspectj.config;

import aspectj.dao.TestDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.el.BeanNameResolver;

public class AOPText {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(AspectjAOPConfig.class);
        TestDao testDaoAdvice=appCon.getBean(TestDao.class);
        testDaoAdvice.save();
        System.out.println("================");
        testDaoAdvice.modify();
        System.out.println("===============");
        testDaoAdvice.delete();
        appCon.close();
    }
}

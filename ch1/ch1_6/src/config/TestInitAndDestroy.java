package config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.MyService;

public class TestInitAndDestroy {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(JavaConfig.class);
        System.out.println("获得对象前");
        MyService ms=appCon.getBean(MyService.class);
        System.out.println("获得对象后"+ms);
        appCon.close();
    }
}
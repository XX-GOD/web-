package annotation;

import annotation.controller.TestController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCon=new AnnotationConfigApplicationContext(ConfigAnnotation.class);
        TestController tc=appCon.getBean(TestController.class);
        tc.save();
        appCon.close();
    }
}

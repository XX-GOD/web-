package test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import dao.TestDao;
import org.springframework.context.ApplicationContext;
public class Test {
    private static ApplicationContext appCon;
    public static void main(String[] args) {
        appCon=new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao tt=appCon.getBean("test", TestDao.class);
        tt.sayHello();
    }
}

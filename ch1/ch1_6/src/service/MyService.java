package service;

public class MyService {
    public void initService(){
        System.out.println(this.getClass().getName());
    }
    public MyService(){
        System.out.println("执行构造方法，创造对象。");
    }
    public void destroyService(){
        System.out.println(this.getClass().getName()+"执行自定义的销毁方法");
    }
}

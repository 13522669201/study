package pattern.JDK动态代理;

public class Hello implements HelloInterface{
    @Override
    public void sayHello() {
        System.out.println("Hello zhanghao!");
    }
}

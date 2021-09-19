import org.junit.jupiter.api.Test;
import pattern.JDK动态代理.Hello;
import pattern.JDK动态代理.HelloInterface;
import pattern.JDK动态代理.ProxyHandler;

import java.lang.reflect.Proxy;

public class TestDynamicProxy {
    @Test
    public void test(){
        HelloInterface hello=new Hello();
        ProxyHandler proxyHandler = new ProxyHandler(hello);
        HelloInterface helloInterface = (HelloInterface)Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), proxyHandler);
        helloInterface.sayHello();
    }
}

import org.junit.jupiter.api.Test;
import pattern.chainofresponsibility.ConcreteHandler1;
import pattern.chainofresponsibility.ConcreteHandler2;
import  pattern.chainofresponsibility.Handler;
public class TestChainOfResponsibilityPattern {
    @Test
    public void test(){
        //组装责任链
        Handler handler1 =new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        //提交请求
        handler1.handleRequest("two");
    }
}

import org.junit.jupiter.api.Test;
import pattern.command.*;
import pattern.command1.Command;
import pattern.command1.ConcreteCommand;
import pattern.command1.Invoker;
import pattern.command1.Receiver;

public class TestCommandPattern {
    @Test
    public  void test(){
        IStock stock=new Stock();
        Order order=new BuyStock(stock);
        Order order1=new SellStock(stock);

        Broker broker=new Broker();
        broker.takeOrder(order);
        broker.takeOrder(order1);

        broker.placeOrders();

        Command command=new ConcreteCommand(new Receiver());
        Invoker invoker=new Invoker(command);
        System.out.println("调用者调用call()");
        invoker.call();;

    }
}

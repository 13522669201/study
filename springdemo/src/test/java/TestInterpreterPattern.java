import org.junit.jupiter.api.Test;
import pattern.interpreter.Context;

public class TestInterpreterPattern {
    @Test
    public void test(){
        Context bus = new Context();
        bus.freeRide("韶关的老人");
        bus.freeRide("韶关的年轻人");
        bus.freeRide("广州的妇女");
        bus.freeRide("广州的儿童");
        bus.freeRide("山东的儿童");
        bus.freeRide("北京的老人");
    }
}

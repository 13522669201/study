import org.junit.jupiter.api.Test;
import pattern.strategy.ConcreteStrategyA;
import pattern.strategy.ConcreteStrategyB;
import pattern.strategy.Context;
import pattern.strategy.Strategy;

public class TestStrategyPattern {
    @Test
    public void test(){
        Context c = new Context();
        Strategy s1 = new ConcreteStrategyA();
        c.setStrategy(s1);
        c.strategyMethod();
        System.out.println("-----------------");
        Strategy s2 = new ConcreteStrategyB();
        c.setStrategy(s2);
        c.strategyMethod();
    }
}

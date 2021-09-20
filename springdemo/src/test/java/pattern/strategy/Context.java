package pattern.strategy;

import lombok.Data;

@Data
public class Context {
    private Strategy strategy;
    public void strategyMethod() {
        strategy.strategyMethod();
    }
}

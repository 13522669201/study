package pattern.command;

public class SellStock implements Order {
    private IStock abcStock;

    public SellStock(IStock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}

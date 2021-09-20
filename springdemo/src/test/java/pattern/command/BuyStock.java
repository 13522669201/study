package pattern.command;

public class BuyStock implements Order {
    private IStock abcStock;

    public BuyStock(IStock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}

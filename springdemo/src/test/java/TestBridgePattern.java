import org.junit.jupiter.api.Test;
import pattern.Bridge.Circle;
import pattern.Bridge.GreenCircle;
import pattern.Bridge.RedCircle;
import pattern.Bridge.Shape;

public class TestBridgePattern {
    @Test
    public void test() {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
import org.junit.jupiter.api.Test;
import pattern.flyweightpattern.Circle;
import pattern.flyweightpattern.ShapeFactory;

public class TestFlyweightPattern {
    private  final String colors[] ={ "Red", "Green", "Blue", "White", "Black" };
    @Test
    public  void test() {

        for(int i=0; i < 20; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
    private  String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private  int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private  int getRandomY() {
        return (int)(Math.random()*100);
    }
}

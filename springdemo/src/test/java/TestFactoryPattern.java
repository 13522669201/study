import org.junit.jupiter.api.Test;
import pattern.factory.Shape;
import pattern.factory.ShapeFactory;

public class TestFactoryPattern {
    @Test
    void test(){
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape circleShape = shapeFactory.getShape("CircleShape");
        circleShape.draw();
    }
}

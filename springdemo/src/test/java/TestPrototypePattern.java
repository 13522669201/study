import org.junit.jupiter.api.Test;
import pattern.prototype.AbstractShape;
import pattern.prototype.Realizetype;
import pattern.prototype.ShapeCache;

public class TestPrototypePattern {
    @Test
    public void test(){
        ShapeCache.loadCache();

        AbstractShape clonedShape = (AbstractShape) ShapeCache.getShape("1");
        clonedShape.draw();
        System.out.println("Shape : " + clonedShape.getType());


        AbstractShape clonedShape3 = (AbstractShape) ShapeCache.getShape("3");
        clonedShape3.draw();
        System.out.println("Shape : " + clonedShape3.getType());
    }
    @Test
    public void test1() throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = (Realizetype) obj1.clone();
        System.out.println("obj1==obj2?" + (obj1 == obj2));
    }
}

package pattern.prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, AbstractShape> shapeMap
            = new Hashtable<String, AbstractShape>();

    public static AbstractShape getShape(String shapeId) {
        AbstractShape cachedShape = shapeMap.get(shapeId);
        return (AbstractShape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}

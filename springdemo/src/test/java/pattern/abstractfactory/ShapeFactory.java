package pattern.abstractfactory;

import javafx.scene.shape.Circle;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String shapeType) {

        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new CircleShape();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RectangleShape();
        }
        return null;
    }
}

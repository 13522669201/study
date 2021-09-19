package pattern.factory;

import javax.lang.model.element.TypeElement;

public class ShapeFactory {
    public Shape getShape(String typename){
        if (typename.equals("CircleShape")){
            return new CircleShape();
        }
        if (typename.equals("RectangleShape")){
            return new RectangleShape();
        }else {
            return null;
        }
    }
}

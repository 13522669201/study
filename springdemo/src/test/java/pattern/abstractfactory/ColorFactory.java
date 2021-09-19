package pattern.abstractfactory;

public class ColorFactory extends  AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new RedColor();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new GreenColor();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}

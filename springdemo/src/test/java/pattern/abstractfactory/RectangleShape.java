package pattern.abstractfactory;

public class RectangleShape implements Shape {

    @Override
    public void draw() {
        System.out.println("画矩形");
    }
}
package pattern.factory;

public class RectangleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("画个矩形");
    }
}

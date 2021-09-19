package pattern.prototype;

public class Rectangle extends AbstractShape{
    public Rectangle(){
        type="Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("画了个矩形");
    }
}

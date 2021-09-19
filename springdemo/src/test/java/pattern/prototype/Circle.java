package pattern.prototype;

public class Circle extends AbstractShape{
    public Circle(){
        type="Circle";
    }
    @Override
    public void draw() {
        System.out.println("画了个圈");
    }
}

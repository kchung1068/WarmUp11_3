public class Circle extends Shape{

    private Point center;
    private int radius;
    public Circle() {

        super("Circle");
        center = new Point();

        radius = 1;
    }
public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
}


}

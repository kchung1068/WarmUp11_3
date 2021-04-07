public class Line extends Shape {
private Point start;
private Point end;

public Line() {
    start = new Point();
    end = new Point();


}
public Line (Point point1, Point point2) {
    start = point1;
    end = point2;
}

}

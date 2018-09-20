package punkty;

public class Points {
    private double point1x;
    private  double point1y;
    private double point2x;
    private double point2y;

    public Points(double point1x, double point1y, double point2x, double point2y) {
        this.point1x = point1x;
        this.point1y = point1y;
        this.point2x = point2x;
        this.point2y = point2y;
    }

    public double getPoint1x() {
        return point1x;
    }

    public void setPoint1x(double point1x) {
        this.point1x = point1x;
    }

    public double getPoint1y() {
        return point1y;
    }

    public void setPoint1y(double point1y) {
        this.point1y = point1y;
    }

    public double getPoint2x() {
        return point2x;
    }

    public void setPoint2x(double point2x) {
        this.point2x = point2x;
    }

    public double getPoint2y() {
        return point2y;
    }

    public void setPoint2y(double point2y) {
        this.point2y = point2y;
    }
}

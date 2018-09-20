public class Line {

    public double length;

    public double odcinek(Points points){

        double x1=points.getPoint1x();
        double y1= points.getPoint1y();
        double x2= points.getPoint2x();
        double y2=points.getPoint2y();

       length=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2));
        //System.out.println(length);
       return length; }

}

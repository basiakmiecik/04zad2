package comparison;
import odcinek.Line;
import punkty.Points;

public class CompLine {

    //odcinek.Line line=new odcinek.Line();
    public double greaterline;
   // punkty.Points points;
  public double comparison(Line line1, Points points, Line line2, Points points2){

      if (line1.odcinek(points)>line2.odcinek(points2)){
          greaterline=line1.odcinek(points); }
          else if(line2.odcinek(points2)>line1.odcinek(points)){
              greaterline=line2.odcinek(points2); }
              else{
                  greaterline=0;//odcinki są rowne
      }
   return greaterline; }

}

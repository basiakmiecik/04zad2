import java.util.Locale;
import java.util.Scanner;

public class UserData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Odcinek 1 \nPodaj wspolrzedne punktu A: \nX: ");
        double x1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Y: ");
        double y1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj wspolrzedne punktu B: \nX:");
        double x2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Y: ");
        double y2 = scanner.nextDouble();
        scanner.nextLine();

        Points points = new Points(x1, y1, x2, y2);
        Line line = new Line();
        line.odcinek(points);

        System.out.println("Odcinek 2\nPodaj wspolrzedne punktu A : \nX: ");
        double x2_1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Y: ");
        double y2_1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("\nPodaj wspolrzedne punktu B: \nX:");
        double x2_2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Y: ");
        double y2_2 = scanner.nextDouble();
        scanner.nextLine();

        Points points2 = new Points(x2_1, y2_1, x2_2, y2_2);
        Line line2 = new Line();
        line2.odcinek(points2);

        CompLine compLine = new CompLine();
        compLine.comparison(line, points, line2, points2);
        if (compLine.comparison(line, points, line2, points2) > 0) {
            if (compLine.comparison(line, points, line2, points2) == line.odcinek(points)) {
                System.out.println("Dłuższy jest odcinek 1");
                System.out.println("Początek odcinka jest w punkcie ("+x1+", " +y1+"), " +
                        "a koniec w punkcie ("+x2+", "+y2+")");
                System.out.println("Długość odcinka wynosi "+ Math.round(line.odcinek(points)));
            } else {
                System.out.println("Dłuższy jest odcinek 2");
                System.out.println("Początek odcinka jest w punkcie ("+x2_1+", " +y2_1+"), " +
                        "a koniec w punkcie ("+x2_2+", "+y2_2+")");
                System.out.println("Długość odcinka wynosi "+ Math.round(line2.odcinek(points2)));
            }
        } else {
            System.out.println("Odcinki są rowne");
        }


    }
}

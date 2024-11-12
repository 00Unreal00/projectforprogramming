import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты вершин первого треугольника (x1 y1 x2 y2 x3 y3): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        System.out.println("Введите координаты вершин второго треугольника (x4 y4 x5 y5 x6 y6): ");
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();
        double x5 = scanner.nextDouble();
        double y5 = scanner.nextDouble();
        double x6 = scanner.nextDouble();
        double y6 = scanner.nextDouble();

        double area1 = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);

        double area2 = Math.abs((x4 * (y5 - y6) + x5 * (y6 - y4) + x6 * (y4 - y5)) / 2.0);

        if (area1 > area2) {
            System.out.println("Первый треугольник имеет большую площадь: " + area1);
        } else if (area2 > area1) {
            System.out.println("Второй треугольник имеет большую площадь: " + area2);
        } else {
            System.out.println("Оба треугольника имеют одинаковую площадь: " + area1);
        }
    }
}
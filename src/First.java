import java.util.Scanner; // импортирование библиотеки для ввода данных
import java.util.InputMismatchException; // импортирование библиотеки для обработки искл. с клав.

public class First {
    public static void  main(String[] args){
        try{
        Scanner in = new Scanner(System.in);// создание сканера
        System.out.print("Введите через пробел x и y:");
        float x = in.nextFloat();
        float y = in.nextFloat();
        System.out.print("Введите через пробел x1 и y1:");
        float x1 = in.nextFloat();
        float y1 = in.nextFloat();
        System.out.print("Введите через пробел x2 и y2:");
        float x2 = in.nextFloat();
        float y2 = in.nextFloat();
        System.out.print("Введите через пробел x3 и y3:");
        float x3 = in.nextFloat();
        float y3 = in.nextFloat();

        float res1 = (x1 - x) * (y2 - y1) - (x2 - x1) * (y1 - y);// вычисляет ориентацию точки  относительно прямой
        float res2 = (x2 - x) * (y3 - y2) - (x3 - x2) * (y2 - y);// вычисляет ориентацию точки  относительно прямой
        float res3 = (x3 - x) * (y1 - y3) - (x1 - x3) * (y3 - y);// вычисляет ориентацию точки  относительно прямой
            if ((res1 > 0 & res2 > 0 & res3 > 0)||((res1 < 0 & res2 < 0 & res3 < 0))) {
            System.out.println("Точка лежит в треугольнике");
        } else if (res1 == 0 || res2 == 0 || res3 == 0) {
            System.out.println("Точка лежит на стороне треугольника");
        }
        else {
            System.out.println("Точка лежит вне треугольника");
        }
    }
    catch(InputMismatchException x){
        System.out.println("Введено некорректное значение");
        }
    }
}

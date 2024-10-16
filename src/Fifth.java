import java.util.Arrays;
import java.util.Scanner;
public class Fifth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Чтобы остановить программу, введите: стоп");
        System.out.println("Введите целое число:");
        int number;
//        while ((!scanner.next().equals("стоп"))) {
//            while (!scanner.hasNextInt()) {
//                scanner.next();
//                System.out.println("Введены неверные данные");
//                System.out.println("Введите целое число:");
//            }
//            number = Math.abs(scanner.nextInt());
//            System.out.println("num");
//        }
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Введены неверные данные");
            System.out.println("Введите целое число:");
        }
        number = Math.abs(scanner.nextInt());
        int x = 10;
        int[] counters = new int[10];
        int[] numbers = new int[]{0,1,2,3,4,5,6,7,8,9};
        while (number != 0){
            counters[number%x] += 1;
            number = number/10;
        }

//        System.out.println("          Цифры:"+Arrays.toString(numbers));
//        System.out.println("Количество цифр:"+Arrays.toString(counters));
        int counter = 0;
        for(int i = 0; i < 10; i ++){
            if(counters[i] >1){
                counter += 1;
                System.out.println("Цифра "+numbers[i] +" повторяется "+ counters[i] + "раз(а)");
            }

        }
        if (counter != 0){
            System.out.println("Итог "+counter+" повторяющися цифр");
        }
        else {
            System.out.println("Нет повторяющихся цифр");
        }
    }
}

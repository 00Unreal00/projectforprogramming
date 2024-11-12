import java.util.Arrays;
import java.util.Scanner;
public class Fifth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Чтобы остановить программу, введите: стоп");
        System.out.println("Введите целое число:");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Введены неверные данные");
            System.out.println("Введите целое число:");
        }
        int number = Math.abs(scanner.nextInt());
        int[] counters = new int[10];
        while (number != 0){
            counters[number%10] += 1;
            number = number/10;
        }
        int counter = 0;
        for(int i = 0; i < 10; i ++){
            if(counters[i] >1){
                counter += 1;
                System.out.println("Цифра "+ i +" повторяется "+ counters[i] + " раз(а)");
            }
        }
        if (counter != 0){
              System.out.println("Есть одинаковые цифры");
        }
        else {
            System.out.println("Нет одинаковых цифр");
        }
    }
}

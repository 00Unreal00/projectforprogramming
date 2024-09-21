import java.util.InputMismatchException;
import  java.util.Scanner;
//import java.util.Arrays;

public class Third{
    public static  void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            int count = 0, summa = 0;
            System.out.println("Введите длину массива:");
            int lenmass = scanner.nextInt();
            System.out.println("Введите массив:");
            int[] nums = new int[lenmass];
            for (int i = 0; i < lenmass; i++) {
                nums[i] = scanner.nextInt();
            }
//        System.out.println(Arrays.toString(nums));
            for (int k = 0; k < lenmass; k++) {
                if (nums[k] % 2 == 0) {
                    summa += nums[k];
                    count += 1;
                }
            }
            System.out.println("Количество чётных чисел:" + count + "\n" + "Сумма чётных чисел:" + summa);
        }
        catch(InputMismatchException x){
            System.out.println("Введено некорректное значение");
        }
    }
}
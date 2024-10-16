import  java.util.Scanner;
import java.util.Arrays;

public class Fourth{
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        while (!scanner.hasNextInt()){
            System.out.println("Введено некоректное значение");
            System.out.println("Введите длину массива:");
            scanner.next();
        }
        int lenmass = Math.abs(scanner.nextInt());
        System.out.println("Введите массив:");
        int[] nums = new int[lenmass];
        for (int i = 0; i < lenmass; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Введено некоректное значение");
                scanner.next();
            }
            nums[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < lenmass; i++){
            if (nums[i]%2 != 0) {
                count += 1;}}
        int[] nums2 = new int[count];
        int count2 = 0;
        for (int i = 0; i< lenmass; i++) {
            if (nums[i] % 2 != 0) {
                nums2[count2] = nums[i];
                count2 += 1;
            }
        }
        System.out.println("Итоговый массив: "+ Arrays.toString(nums2));

        }
    }

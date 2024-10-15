import  java.util.Scanner;
import java.util.Arrays;

public class Fourth{
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        while (!scanner.hasNextInt()){
            System.out.println("Введено некоректное значение");
            scanner.next();
        }
        int lenmass = scanner.nextInt();
        System.out.println("Введите массив:");
        int[] nums = new int[lenmass];
        int[] nums2 = new int[lenmass/2];
        for (int i = 1; i <= lenmass; i++) {
            ;
            while (!scanner.hasNextInt()) {
                System.out.println("Введено некоректное значение");
                scanner.next();
            }
            nums[i] = scanner.nextInt();
            if ((i) % 2 != 0) {

                nums2[i/2] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));

        }

    }

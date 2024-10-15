import  java.util.Scanner;
//import java.util.Arrays;

public class Third{
    public static  void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int count = 0, summa = 0;
            System.out.println("Введите длину массива:");
            while (!scanner.hasNextInt()){
                System.out.println("Введено некоректное значение");
                scanner.next();
            }
            int lenmass = Math.abs(scanner.nextInt());
            System.out.println("Введите массив:");
            int[] nums = new int[lenmass];
            for (int i = 0; i < lenmass; i++) {;
                while (!scanner.hasNextInt()){
                    System.out.println("Введено некоректное значение");
                    scanner.next();
                }
                nums[i] = scanner.nextInt();
            }
//        System.out.println(Arrays.toString(nums));
            for (int i = 0; i < lenmass; i++) {
                if (nums[i] % 2 == 0) {
                    summa += nums[i];
                    count += 1;
                }
            }
            System.out.println("Количество чётных чисел:" + count + "\n" + "Сумма чётных чисел:" + summa);
        }

    }

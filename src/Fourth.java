import  java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Fourth{
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        while (!scanner.hasNextInt()){
            System.out.println("Введено некоректное значение");
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
        ArrayList<Integer> oddnum = new ArrayList<>();
        for (int i = 0; i < lenmass; i++){
            if (nums[i]%2 != 0) {
                oddnum.add(nums[i]);}}
        int[] nums2 = new int[oddnum.size()];
        for (int i = 0; i< oddnum.size(); i++){
            nums2[i] = oddnum.get(i);
        }
        nums = nums2;
        System.out.println("Итоговый массив: "+Arrays.toString(nums));

        }

    }

import java.util.Arrays;
import java.util.Scanner;

public class Sixth {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        while (!scanner.hasNextInt()){
            System.out.println("Введено некоректное значение");
            System.out.println("Введите количество строк:");
            scanner.next();
        }
        int lenmass1 = Math.abs(scanner.nextInt());
        int [] mnums = new int[lenmass1];
        System.out.println("Введите количество столбцов:");
        while (!scanner.hasNextInt()){
            System.out.println("Введено некоректное значение");
            System.out.println("Введите количество столбцов:");
            scanner.next();
        }
        int lenmass2 = Math.abs(scanner.nextInt());
        int [][] nums = new int[lenmass1][lenmass2];
        for(int i = 0; i <lenmass1; i++){
            for(int j = 0; j < lenmass2; j++){
                nums[i][j] = (int) (Math.random() * (20 - (1) + 1)) + (1);
                }}
        System.out.println("Сгенерированный двумерный массив:");
        for(int i = 0; i <lenmass1; i++){
            System.out.println(Arrays.toString(nums[i]));
            for(int j = 0; j < lenmass2; j++){
                if (nums[i][j] > mnums[i]) {
                    mnums[i] = nums[i][j];
                }}}
        System.out.println("Резултьат: \n"+Arrays.toString(mnums));
    }
}


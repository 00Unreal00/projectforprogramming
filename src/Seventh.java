import java.util.Scanner;
import java.util.Arrays;
public class Seventh {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        while (!scanner.hasNextInt()){
            System.out.println("Введено некоректное значение");
            System.out.println("Введите количество строк:");
            scanner.next();
        }
        int lenmass1 = Math.abs(scanner.nextInt());
        int lenmass2 = -1;
        while(lenmass2 != lenmass1){
            System.out.println("Введите количество столбцов, оно должно быть равно количеству строк:");
            while (!scanner.hasNextInt()){
                System.out.println("Введено некоректное значение");
                System.out.println("Введите количество столбцов:");
                scanner.next();
            }
            lenmass2 = Math.abs(scanner.nextInt());
        }
        int [][] nums = new int[lenmass1][lenmass2];
        for(int i = 0; i <lenmass1; i++){
            for(int j = 0; j < lenmass2; j++){
                nums[i][j] = (int) (Math.random() * (20 - (1) + 1)) + (1);
            }}
        System.out.println("Сгенерированный массив:");
        int [] diagnums = new int[lenmass1];
        for(int i = 0; i < lenmass1; i++){
            diagnums[i] = nums[i][i];
            System.out.println(Arrays.toString(nums[i]));
        }
        System.out.println("Итоговый массив:");
        for(int i = 0; i < lenmass1; i ++){
            for(int j = 0;j < lenmass1 - i - 1; j++){
                if (diagnums[j+1] < diagnums[j]){
                    int per = diagnums[j];
                    diagnums[j] = diagnums[j+1];
                    diagnums[j+1] = per;
                }
            }
        nums[i][i] = diagnums[i];
        System.out.println(Arrays.toString(nums[i]));
        }
    }
}

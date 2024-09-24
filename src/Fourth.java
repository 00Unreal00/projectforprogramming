import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Fourth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    System.out.println("Введите длину списка:");
    int lenmass = scanner.nextInt();
    System.out.println("Введите список:");
    for(int i = 0; i < lenmass; i ++){
        numbers.add(scanner.nextInt());

    }
    for(int j = 0; j < lenmass; j ++){
        if(j%2==0){
            numbers.remove(j);
        }

    }
    System.out.println(numbers.toString());
    }
}

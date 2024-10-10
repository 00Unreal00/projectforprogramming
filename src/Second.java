public class Second {
    public static void main(String[] args){
        double summa = 1;
        double element = 1;
        for (int i = 1 ; i <= 8; i++){
            element = element/3;
            summa += element;
            System.out.println(element);
            System.out.println(summa);
        }
    System.out.println("Сумма:" + summa);
    }
}

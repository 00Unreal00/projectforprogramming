public class Second {
    public static void main(String[] args){
        double summa = 0;
        double element = 1;
        for (int i = 0 ; i <= 8; i++){
            summa += element;
            element = element/3;

        }
    System.out.println("Сумма:" + summa);

    }
}

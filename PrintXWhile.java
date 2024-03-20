import java.util.Scanner;
public class PrintXWhile {
    public static void main(String[] args) {
        int Sum, x;
        Scanner input= new Scanner(System.in);
        Sum= 0;

        System.out.println("Masukkan nilai x (int, akhiri dengan 999: )");
        x= input.nextInt();
        while(x != 999){
            Sum=Sum+x;
            System.out.println("Masukkan nilai x (int), akhiri dengan 999: ");
            x= input.nextInt();
        }
        System.out.println("Hasil penjumlahan= "+ Sum);
    }
}

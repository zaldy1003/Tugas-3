import java.util.Scanner;
public class PrintXRepeat {
    public static void main(String[] args){
        int Sum, x;

        Scanner input= new Scanner(System.in);

        System.out.println("Masukkan nilai x (int), akhiri dengan 999: ");

        x= input.nextInt();
        if(x==999){
            System.out.println("Kasus kosong \n");
        }else{
            Sum= 0;

            do{
                Sum= Sum+ x;
                System.out.println("Masukkan nilai x (int), akhiri dengan 999: ");
                x= input.nextInt();
            }while(x != 999);
            System.out.println("Hasil penjumlahan= " + Sum);
        }
    }
}

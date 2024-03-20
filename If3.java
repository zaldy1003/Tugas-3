import java.util.Scanner;
public class If3 {
    public static void main(String[] args){
        System.out.println("Contoh IF tiga kasus \n");
        System.out.println("Input suatu nilai integer: ");
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();

        if(a > 0){
            System.out.println("Nilai a positif "+ a);
        }else if(a == 0){
            System.out.println("Nilai 0 "+ a);
        }else{
            System.out.println("Nilai a negatif "+a);
        }
    }
}

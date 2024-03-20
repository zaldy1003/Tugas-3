import java.util.Scanner;
public class If2 {
    public static void main(String[] args){
        int a;
        Scanner input= new Scanner(System.in);

        System.out.println("Contoh IF dua kasus\n");

        System.out.println("Ketikkan suatu nilai integer: ");
        a= input.nextInt();

        if(a>=0){
            System.out.println("Nilai suatu nilai "+ a);
        }else{
            System.out.println("Nilai a negatif "+ a);
        }
    }
}

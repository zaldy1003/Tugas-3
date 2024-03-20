import java.util.Scanner;

public class If1 {
    public static void main(String []args){
        Scanner Input= new Scanner(System.in);

        System.out.println("Contoh IF satu kasus \n");
        System.out.println("Ketikkan suatu nilai integer: ");
        int a = Input.nextInt();
        if(a >= 0){
            System.out.print("\nNilai a Positif "+ a);
        }
    }
}

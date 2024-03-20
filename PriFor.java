import java.util.Scanner;
public class PriFor {
    public static void main(String[] args){
        int i, N;
        Scanner input= new Scanner(System.in);

        System.out.println("Baca N, print 1 sampai N");
        System.out.println("N = ");

        N=input.nextInt();

        for(i=1; i<=N; i++) {
            System.out.println(i);
            System.out.println("Akhiri program \n");
        }
    }
}

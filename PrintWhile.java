import java.util.Scanner;
public class PrintWhile {
    public static void main(String[] args){
        int N, i;

        Scanner input= new Scanner(System.in);
        N= input.nextInt();
        i=1;

        System.out.println("Print i dengan WHILE: \n");
        while (i <= N){
            System.out.println(i);
            i++;
        }

    }
}

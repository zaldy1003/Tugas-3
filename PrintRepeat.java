import java.util.Scanner;
public class PrintRepeat {
    public static void main(String[] args){
        int N, i;
        Scanner input= new Scanner(System.in);
        System.out.println("Nilai N>0 = ");
        N= input.nextInt();

        i=1;
        System.out.println("Print i dengan REPEAT");
        do{
            System.out.println(i+"\n");
            i++;
        }while (i <= N);
    }
}

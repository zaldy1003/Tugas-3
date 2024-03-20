import java.util.Scanner;
public class PrintIterasi {
    public static void main(String[] args){
        int N;
        int i;
        Scanner input= new Scanner(System.in);

        System.out.println("Nilai N > 0 = ");
        N= input.nextInt();

        i= 1;
        System.out.println("Print i dengan ITERATE: \n");
        for (;;){
            System.out.println(i);
            if(i == N){
                System.out.println("Kondisi berhenti");
                break;
            }else{
                System.out.println(" ");i++;
            }
        }
    }
}

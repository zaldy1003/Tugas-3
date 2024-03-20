import java.util.Scanner;
public class Konstant {
    public static void main(String[] args){
        final float PHI= 3.1415f;
        float r;
        Scanner input= new Scanner(System.in);

        System.out.println("Jari-jari lingkaran= ");
        r= input.nextFloat();

        System.out.println("Luas lingkaran= "+ (PHI *r*r) + "\n");
        System.out.println("Akhiri program \n");
    }
}

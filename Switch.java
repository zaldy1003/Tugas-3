import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        char cc;
        Scanner input = new Scanner(System.in);

        System.out.println("Ketikkan sebuah huruf, akhiri dengan Return\n");
        cc = input.next().charAt(0);

        switch (cc) {
            case 'a': {
                System.out.println("Yang anda ketik adalah a\n");
                break;
            }
            case 'i': {
                System.out.println("Yang anda ketik adalah i\n");
                break;
            }
            case 'u': {
                System.out.println("Yang anda ketik adalah u\n");
                break;
            }
            case 'e': {
                System.out.println("Yang anda ketik adalah e\n");
                break;
            }
            case 'o': {
                System.out.println("Yang anda ketik adalah o\n");
                break;
            }
            default:
                System.out.println("Yang anda ketik adalah huruf mati\n");
        }
    }
}

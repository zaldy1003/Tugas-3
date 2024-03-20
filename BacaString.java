import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import javax.swing.*;

public class BacaString {
    public static void main(String[] args) throws IOException {
        String str;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nBaca String dan Integer: \n");
        System.out.println("Masukkan sebuah String: \n");
        str= input.readLine();
        System.out.print ("Sting yang dibaca: "+ str);
    }
}
import java.util.Random;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        System.out.println("Enter the length of your password");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println(new_password(length));

    }
    static char[] new_password(int len)
    {
        System.out.println("your new password is :");
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String Numbers="0123456789";
        String Symbols = "~!@#$%^&*()_+}{][:'<>,.?/";
        String Mix = "@#%$#$%rcy45345tc98098jhb54345bie452th%^%^$&^8";

        String values = Capital_chars + Mix + Small_chars + Numbers + Symbols;

        Random random_method = new Random();

        char[] Password = new char[len];

        for (int i = 0; i < len; i++) {

            Password [i]= values.charAt(random_method.nextInt(values.length()));


        }
        return Password;
    }
}

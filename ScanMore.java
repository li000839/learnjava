import java.util.Scanner;

public class ScanMore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read one "token" (read until a space is found)
        System.out.print("Input a word: ");
        String input = scanner.next();
        System.out.println(input);

        // Read an integer
        System.out.print("Input integer: ");
        int i = scanner.nextInt();
        System.out.println(i);

        // Read a double
        System.out.print("Input double: ");
        double d = scanner.nextDouble();
        System.out.println(d);

        // Read a boolean (gives true if the input is "true", ignoring case)
        System.out.print("Input boolean:");
        boolean b = scanner.nextBoolean();
        System.out.println(b);

    }    
}
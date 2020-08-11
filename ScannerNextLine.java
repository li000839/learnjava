import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your input: ");

        double d = scanner.nextDouble();
        String s = scanner.nextLine();
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(d);
        System.out.println(s1);
        System.out.println(s2);
    }
}
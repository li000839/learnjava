import java.util.Scanner;
public class testWhileScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String text = scanner.next();
            scanner.nextLine();
            System.out.println(text);
        }
    }
}

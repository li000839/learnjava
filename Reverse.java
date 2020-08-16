/* accepts a line of input from the user, and reverses it.
 */
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Say something: ");
        String input = scanner.nextLine();
        int length = input.length();

        while (length != 0) {
            System.out.print(input.substring(length-1));
            input = input.substring(0, length-1);
            length--;
        }
    }
}

/* input n from the user, and then accepts n more integers.
 * print the numbers entered on one line, and then the numbers in sorted order on the next
 */
import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[n];
        System.out.println("Enter n more numbers: ");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        System.out.println(Arrays.toString(array));
    }
}

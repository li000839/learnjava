/*  keep track of the largest and smallest numbers that have been input, and once the loop ends, must print them out
*/
import java.util.Scanner;
public class findNum {
    public static void main(String[] args){
        final String ORDER = "Input a number: ";
        Scanner scanner = new Scanner(System.in);

        System.out.print(ORDER);
        int big = 0;
        int small = 0;
        while(scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num > big) {
                    big = num;
                } else if (num < small) {
                    small = num;
                }
            } else {
                String eat = scanner.next();
                System.out.println("No numbers entered.");
            }
            System.out.print(ORDER);
        }

        System.out.format("Min number: " + small + "\nMax number: " + big);


    }
}

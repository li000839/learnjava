import java.util.Scanner;
public class UserInput2 {
    public static void main(String[] args) {
        final String SPACE = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String input = scanner.nextLine();
        System.out.println(input.length());
        
        int index = input.indexOf(SPACE);
        System.out.println(input.substring(0, index));
        System.out.println(input.substring(index+1));

    }
}
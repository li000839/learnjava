import java.util.Scanner;
public class Input2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter inputs: ");
        String text = scanner.nextLine();
        String leftChar = scanner.nextLine();
        String rightChar = scanner.nextLine();
        String charToRemove = scanner.nextLine();
        int width = scanner.nextInt();

        // remove char
        int index = text.indexOf(charToRemove);
        text = text.substring(0, index) + text.substring(index + 1);
        
        // to upper case
        text = text.toUpperCase();
        
        // calculate padding length
        int length = text.length();
        length = (50 - length) / 2;

        // print out
        String leftOutput = String.format("%"+ length + "s", leftChar).replace(" ", leftChar);
        String rightOutput = String.format("%"+ length + "s", rightChar).replace(" ", rightChar);
        String output = leftOutput + text + rightOutput;
        System.out.println(output);
    }
    
}
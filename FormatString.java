import java.util.Scanner;
public class FormatString {
    public static void main(String[] args) {   
        final String point = "."; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the currency values: ");
        
        // Numeric values
        int thousands = Integer.parseInt(scanner.nextLine());
        int hundreds = Integer.parseInt(scanner.nextLine());
        int cents = Integer.parseInt(scanner.nextLine());
        int places = Integer.parseInt(scanner.nextLine());
        
        // Character values
        // We could convert these to chars but it does the same thing
        String separator = scanner.nextLine();
        String currency = scanner.nextLine();
        
        String output = String.format("%6$1s%1$03d%5$1s%2$03d.%3$-" + places +"d", thousands, hundreds, cents, places, separator, currency);
        System.out.print(output.replace(" ", "0"));
        
    }
}
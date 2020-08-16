import java.util.Scanner;
public class EncodingDeconding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.print("Encoding/Decoding? ");
        while (scanner.hasNext()) {

            String input = scanner.next();
            // eat '\n'
            scanner.nextLine();
            if (input.equals("Stop")) {
                break;
            } else {
                System.out.print("Enter n: ");
                int shift = scanner.nextInt();
                // eat '\n'
                scanner.nextLine();

                System.out.print("Enter text to convert: ");
                text = scanner.nextLine();
                text = text.toUpperCase();

                if(text.contains(" ")) {
                    int index = text.indexOf(" ");
                    text = text.substring(0, index) + text.substring(index + 1);
                }
                System.out.println(text);
                int length = text.length();

                if (input.equals("Encode")) {
                    while (length != 0) {
                        char convert_char = text.charAt(0);
                        int convert_int = (int) convert_char;
                        convert_int += shift;
                        // Z to A
                        if (convert_int > 90) {
                            convert_int -= 26;
                        }
                        convert_char = (char) convert_int;
                        System.out.print(convert_char);
                        text = text.substring(1, length);
                        length--;
                    }
                } else if (input.equals("Decode")) {
                    while (length != 0) {
                        char convert_char = text.charAt(0);
                        int convert_int = (int) convert_char;
                        convert_int -= shift;
                        // A to Z
                        if (convert_int < 65) {
                            convert_int += 26;
                        }
                        convert_char = (char) convert_int;
                        System.out.print(convert_char);
                        text = text.substring(1, length);
                        length--;
                    }
                }

            }
            System.out.print("\nEncoding/Decoding? ");
        }


    }
}

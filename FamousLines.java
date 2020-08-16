import java.util.Scanner;
public class FamousLines {
    public static void main(String[] args){
        final String GAME = "Winter is coming";
        final String STAR = "I am your father";
        final String BAD = "I am the one who knocks";
        final String AVENGERS = "Hulk, smash";
        final String FROZEN = "Let it go!";
        final String UNKONWN = "Sorry, I don't know that one";

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("Game of Thrones")) {
            System.out.println(GAME);
        } else if (input.equals("Star Wars")) {
            System.out.println(STAR);
        } else if (input.equals("Breaking Bad")) {
            System.out.println(BAD);
        } else if (input.equals("The Avengers")) {
            System.out.println(AVENGERS);
        } else if (input.equals("Frozen")) {
            System.out.println(FROZEN);
        } else {
            System.out.println(UNKONWN);
        }
    }
}

import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        final String NORTH = "NORTH";
        final String ESAT = "ESAT";
        final String SOUTH = "SOUTH";
        final String WEST = "WEST";
        final String INVALID = "INVALID";

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        switch(input){
            case NORTH:
                System.out.println("0 degrees from North");
                break;
            case ESAT:
                System.out.println("90 degrees from North");
                break;
            case SOUTH:
                System.out.println("180 degrees from North");
                break;
            case WEST:
                System.out.println("270 degrees from North");
                break;
            default:
                System.out.println(INVALID);
        }
    }
}

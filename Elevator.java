import java.util.Scanner;
public class Elevator {

    public static void main(String[] args) {

        final String FLOOR_CHAR = "f";
        final String DOOR_CHAR = "d";
        final String EMERGENCY_CHAR = "e";

        final int MIN_FLOOR = 0;
        final int MAX_FLOOR = 9;

        final int MAX_PEOPLE = 12;
        final int MAX_WEIGHT = 1000;

        // Get the elevator's command
        System.out.format("Please enter command!\n");
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine().toLowerCase();

        // floor command
        if (command.equals(FLOOR_CHAR)) {
            System.out.format("Please enter floor command!\n");
            // Accept the rest of the command
            int currentFloor = Integer.parseInt(scanner.nextLine());
            int nextFloor = Integer.parseInt(scanner.nextLine());

            // Validate the input
            if (currentFloor < MIN_FLOOR || currentFloor > MAX_FLOOR || nextFloor < MIN_FLOOR
                    || nextFloor > MAX_FLOOR) {
                System.out.println("Error: Invalid floor");
            } else if (currentFloor == nextFloor) {
                System.out.println("Error: Already on floor " + currentFloor);
            } else {
                System.out.format("Action: Moving from floor %d to floor %d\n",
                        currentFloor, nextFloor);
            }
        } else if (command.contains(DOOR_CHAR)) {
            System.out.format("Please enter door command!\n");

            // Accept the rest of the command
            String doorCommand = scanner.nextLine();

            // Execute the commands if they're valid
            if (doorCommand.equals("Open")) {
                System.out.println("Action: Opening doors");
            } else if (doorCommand.equals("Close")) {
                System.out.println("Action: Closing doors");
            } else {
                System.out.println("Error: Invalid door command");
            }
        } else if (command.equals(EMERGENCY_CHAR) ) {
            System.out.format("Please enter emergency command!\n");

            // Accept the rest of the command
            String emergencyCommand = scanner.nextLine();

            switch (emergencyCommand) {
                case "Weight" -> System.out.format("Emergency: Can hold at most %d people " +
                                "or %dkg in the elevator\n", MAX_PEOPLE,
                        MAX_WEIGHT);
                case "Stop" -> System.out.println("Emergency: Elevator has stopped");
                case "Inoperable" -> System.out.println("Emergency: Elevator has stopped working");
                default -> System.out.println("Error: Invalid emergency command");
            }
        } else {
            System.out.println("Error: Invalid command");
        }

    }
}
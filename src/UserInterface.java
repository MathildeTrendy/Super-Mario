import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {

        //introduction for the game
        System.out.println("\n" +
                "You have just arrived in an outlandish realm called the Mushroom Kingdom. It was ruled by Princess Toadstool and her faithful Mushroom people. \n" +
                "But one day, evil cast a shadow over the land and the evil King Bowser Koopa emerged with his army of Goombas, Spinies, Flying Koopas, and other malignant creatures. \n" +
                "King Koopa abducted Princess Toadstool and trapped her. So It's now up to you, to save the princess and defeat King Koopa and his minions\n");


        String north;
        String south;
        String east;
        String west;
        String exit;


        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Adventure time - choose a direction to go. \n Type in, if you want to go north, south east or west.");
    boolean isRunning = true;
        do {
            String playerInput = sc.nextLine(); //Gemmer userInput, i stedet for bare at have en string fx "string playerinput;"
            playerInput = playerInput.toLowerCase();
            switch (playerInput) {
                case "go north", "north":
                    System.out.println("Going north");
                    break;
                case "west":
                    System.out.println("Going west");
                    break;
                case "east":
                    System.out.println("Going east");
                    break;
                case "south":
                    System.out.println("Going south");
                    break;

                case "look around", "look":
                    System.out.println("Welcome to"); //TODO Udskriv "Room1"
                    break;

                case "exit":
                    System.out.println("tak for alt");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Unknown command.");
                    break;
            }

        } while (isRunning);
    }

}

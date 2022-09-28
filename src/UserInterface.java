import java.util.Locale;
import java.util.Scanner;

    public class UserInterface {
    private Scanner keyb = new Scanner(System.in).useLocale(Locale.ENGLISH);

    public void start() {
        //introduction to the game
        System.out.println("\n" +
                "You have just arrived in an outlandish realm called the Mushroom Kingdom. It was ruled by Princess Toadstool and her faithful Mushroom people. \n" +
                "But one day, evil cast a shadow over the land and the evil King Bowser Koopa emerged with his army of Goombas, Spinies, Flying Koopas, and other malignant creatures. \n" +
                "King Koopa abducted Princess Toadstool and trapped her. So It's now up to you, to save the princess and defeat King Koopa and his minions\n");

        Adventure adventure = new Adventure();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Adventure time - choose a direction to go. \n" +
                "Type in, if you want to go north, south, east or west.");

        boolean isRunning = true;

        do {
            String playerInput = sc.nextLine(); //Gemmer userInput, i stedet for bare at have en string fx "string playerinput;"
            playerInput = playerInput.toLowerCase();

            switch (playerInput) {
                case "go north", "north", "n":
                    System.out.println("Going north");
                    break;
                case "go west", "west", "w":
                    System.out.println("Going west");
                    break;
                case "go east", "east", "e":
                    System.out.println("Going east");
                    break;
                case "go south", "south", "s":
                    System.out.println("Going south");
                    break;

                case "look around", "look":
                    System.out.println("Welcome to the" ); //TODO Udskriv hvilket rum du er i"
                    System.out.println(adventure.getCurrentRoom().getNameOfRoom());
                    break;

                case "exit":
                    System.out.println("exiting the game...");
                    isRunning = false;
                    System.exit(1);
                    break;

                case "help", "clue", "i need help":
                    System.out.println("Do you need help?"); //TODO inkludere help setting - gør evt af brugeren kan svare ja eller nej på af få hjælp og ja eller nejn til af få et ledetråd
                    break;

                default:
                    System.out.println("Unknown command");
                    break;
            }

        } while (isRunning);
        }

    }



import java.util.Scanner;

public class UserInterface {
    public void start() {

        //introduction for the game
        System.out.println("\n" +
                "You have just arrived in an outlandish realm called the Mushroom Kingdom. It was ruled by Princess Toadstool and her faithful Mushroom people. \n" +
                "But one day, evil cast a shadow over the land and the evil King Bowser Koopa emerged with his army of Goombas, Spinies, Flying Koopas, and other malignant creatures. \n" +
                "King Koopa abducted Princess Toadstool and trapped her. So It's now up to you, to save the princess and defeat King Koopa and his minions\n");

        Adventure adventure = new Adventure();
        String north;
        String south;
        String east;
        String west;
        String exit;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Adventure time - choose a direction to go. \n" +
                "Type in, if you want to go north, south, east or west.");
        boolean isRunning = true;

        do {
            String playerInput = sc.nextLine(); //Gemmer userInput, i stedet for bare at have en string fx "string playerinput;"
            playerInput = playerInput.toLowerCase();
            switch (playerInput) {
                case "go north", "north":
                    System.out.println("Going north");
                    break;
                case "go west", "west":
                    System.out.println("Going west");
                    break;
                case "east":
                    System.out.println("Going east");
                    break;
                case "south":
                    System.out.println("Going south");
                    break;

                case "look around", "look":
                    System.out.println("Welcome to the" ); //TODO Udskriv "Room1"
                    System.out.println(adventure.getCurrentRoom().getNameOfRoom());
                    break;

                case "exit":
                    System.out.println("tak for alt");
                    isRunning = false;
                    break;

                case "help", "clue", "i need help":
                    System.out.println("Do you need some help?"); //TODO inkludere help setting - gør evt af brugeren kan svare ja eller nej på af få hjælp og ja eller nejn til af få et ledetråd
                    break;

                default:
                    System.out.println("Unknown command.");
                    break;
            }

        } while (isRunning);
    }
    }


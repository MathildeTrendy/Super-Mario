import java.util.Locale;
import java.util.Scanner;

  public class UserInterface {

  private Scanner keyb = new Scanner(System.in).useLocale(Locale.ENGLISH);
  private Adventure adventure;
  //private Adventure game;

  public UserInterface(Adventure c){
      this.adventure = c;}

      //Method for handling all input from user //TODO find ud af om det kan udskiftes men nedstående
    public void playerInput(String input){
      while (!input.equals("exit")){
          input = keyb.nextLine().toLowerCase();
          String[] inputSplit = input.split(" ");
          String direction = "";
          String command = inputSplit[0];

          if (inputSplit.length > 1){
              direction = inputSplit[1];
          }
      }
    }

    public void start() {
        //introduction to the game
        adventure = new Adventure();
        System.out.println("\n" + "You have just arrived in an outlandish realm called the Mushroom Kingdom. It was ruled by Princess Toadstool and her faithful Mushroom people. \n" +
                "But one day, evil cast a shadow over the land and the evil King Bowser Koopa emerged with his army of Goombas, Spinies, Flying Koopas, and other malignant creatures. \n" +
                "King Koopa abducted Princess Toadstool and trapped her. So It's now up to you, to save the princess and defeat King Koopa and his minions\n");
        System.out.println("Welcome to Adventure time - choose a direction to go. \n" + "Type in, if you want to go north, south, east or west.");

        boolean isRunning = true;
        do {
            Scanner sc = new Scanner(System.in);
            String playerInput = sc.nextLine(); //Gemmer userInput, i stedet for bare at have en string fx "string playerinput;"
            playerInput = playerInput.toLowerCase();

            switch (playerInput) {
                case "go north", "north", "n":

                    if (adventure.goNorth()){
                        System.out.println("Going north" + adventure.getStarterRoom().getNameOfRoom() + "\n" + adventure.getStarterRoom().getDescriptionOfRoom());
            }else{
                        System.out.println("You cannot go that way.");
                    }break;

                case "go west", "west", "w":
                    System.out.println("Going west");
                    if (adventure.goWest()){
                        System.out.println("Going west" + adventure.getCurrentRoom().getNameOfRoom() + "\n" + adventure.getCurrentRoom().getDescriptionOfRoom());
                    }else{
                        System.out.println("You cannot go that way.");
                    }break;


                case "go east", "east", "e":
                    System.out.println("Going east");
                    if (adventure.goEast()){
                        System.out.println("Going east" + adventure.getCurrentRoom().getNameOfRoom() + "\n" + adventure.getCurrentRoom().getDescriptionOfRoom());
                    }else{
                        System.out.println("You cannot go that way.");
                    }break;

                case "go south", "south", "s":
                    System.out.println("Going south");
                    if (adventure.goSouth()){
                        System.out.println("Going south" + adventure.getCurrentRoom().getNameOfRoom() + "\n" + adventure.getCurrentRoom().getDescriptionOfRoom());
                    }else{
                        System.out.println("You cannot go that way.");
                    }break;


                case "look around", "look":
                    //TODO kig på getdescription, udskriver ikke"
                    System.out.println(adventure.getCurrentRoom().getNameOfRoom());
                    System.out.println(adventure.getCurrentRoom().getDescriptionOfRoom());
                    System.out.println(adventure.getCurrentRoom().getItems());
                    break;

                case "exit":
                    System.out.println("exiting the game...");
                    isRunning = false;
                    System.exit(1);
                    break;

                case "help", "clue", "i need help":
                    System.out.println("Do you need help?"); //TODO inkludere help setting - gør evt af brugeren kan svare ja eller nej på af få hjælp og ja eller nej til af få et ledetråd
                    break;

                case "take":
                    System.out.println("what do you wanna take?");
                    String itemname = sc.nextLine(); //Gemmer userInput, i stedet for bare at have en string fx "string playerinput;"
                    playerInput = playerInput.toLowerCase();
                    //Item itemPickedUp = adventure.getPlayer().removeItem(itemname);
                    //System.out.println("you have now taken " + itemPickedUp);
                    break;
        /*
                case "eat":
                case "drink":
                    String foodname = secondWorld;
                    result = adventure.eat(foodname);
                    switch (result) {
                        case NOT_FOUND:
                            System.out.println("there is no such thing as a " + foodname + " - et eat anywhere nearby");
                            break;
                        case CANT:
                            System.out.println("You can´t eat " + foodname + " - it isn`t food!!");
                        case OK:
                            System.out.println("You have eaten the " + foodname + " - your health is now: " + adventure.);
                    }
*/

                default:
                    System.out.println("Unknown command");
                    break;
            }

        } while (isRunning);
        }

    }

//lav take, drop og en inventory



public class Main {
    //This class is the launcher for Userinterface class

    public static void main(String[] args) {
        //controller
        Adventure c = new Adventure();
        //Ui
        UserInterface ui = new UserInterface(c);
        ui.start();

    }
}


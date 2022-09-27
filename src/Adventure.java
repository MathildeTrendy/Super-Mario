import java.util.Currency;

public class Adventure {


    private Room currentRoom = new Room ("Mushroom Kingdom", "You are now in the center of Mushroom World, a world that is orbited by a vast chain of small planetoids");

    public Room getCurrentRoom (){
        return currentRoom;}

    // Different Rooms with name and description
    public void createRooms() {
    Room room2 = new Room("Yoshi's Island", "need description...");
    Room room3 = new Room("Donut Plains", "need description...");
    Room room4 = new Room("Vanilla Dome", "need description...");
    Room room5 = new Room("Twin Bridges", "need description...");
    Room room6 = new Room("Forest of Illusion", "need description...");
    Room room7 = new Room("King Bowser Koopa land", "need description...");
    Room room8 = new Room("Chocolate Island", "need description...");
    Room room9 = new Room("Valley of Bowser", "need description...");

    //Setting directions for each room
    currentRoom.setEast(room2);
    currentRoom.setSouth(room3);

    room2.setWest(currentRoom);
    room2.setEast(room3);

    room3.setWest(room2);
    room3.setSouth(room6);

    room4.setNorth(currentRoom);
    room4.setSouth(room7);

    room5.setSouth(room8);

    room6.setNorth(room3);
    room6.setSouth(room9);

    room7.setNorth(room4);
    room7.setEast(room8);

    room8.setNorth(room5);
    room8.setWest(room7);
    room8.setEast(room9);

    room9.setNorth(room6);
    room9.setWest(room8);
    }

}


public class Map {

    //TODO A bit doubtful about the importance of this object - ask Peter about it...
    private Room currentRoom = new Room ("Mushroom Kingdom");
    public Room getCurrentRoom (){
        return currentRoom;}

    private Room starterRoom;

    // Different Rooms with name and description, creating room objects
    public void createRooms() {
        Room room1 = new Room("Mushroom Kingdom, In order to find King Koopa and save the princess you must go out in the world and explore the other 8 realms. You have a long journey ahead of you. " +
                "You must intrepid deep and hazardous waters, jump from tree to tree, and visually examine your steps in the dark evil castles filled with fire balls and lava pits. " +
                "Be wise and collect everything necessary on your way to obtain maximum power to subjugate the evil King Koopa and rescue the Princess. \n" +
                " \n" + "You are now in a realm called the Mushroom Kingdom, a world orbited by a vast chain of small planetoids and the sweet Mushroom people.");

        Room room2 = new Room("Yoshi's Island" + "You have just entered Yoshi's Island which is a large, tropical and mountainous island inhabited by the peace-loving Yoshis. " +
                "You are standing on the beach, next to you are some huge palm trees, by the foot of the trees there are some fallen coconuts. " +
                "Further ahead is there an old well.");

        Room room3 = new Room("Donut Plains" );
        Room room4 = new Room("Vanilla Dome castle");
        Room room5 = new Room("Twin Bridges");
        Room room6 = new Room("Forest of Illusion");
        Room room7 = new Room("King Bowser Koopa land");
        Room room8 = new Room("Chocolate Island");
        Room room9 = new Room("Valley of Bowser");

        //Setting directions for each room
        room1.setEast(room2);
        room1.setSouth(room3);

        room2.setWest(room1);
        room2.setEast(room3);

        room3.setWest(room2);
        room3.setSouth(room6);

        room4.setNorth(room1);
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


        //Setting starterRoom to room1 at the start
        starterRoom = room1;
    }

    public Room getStarterRoom(){
        return starterRoom;
    }


    public void createMap() {
    }
}

public class Map {

    private Room starterRoom;


    // TODO den opfanger ligesom ikke rigtig descriptionofroom
    // Different Rooms with name and description, creating room objects
    public void createRooms() {
        Room room1 = new Room("name");
        Room room2 = new Room("name");
        Room room3 = new Room("Donut Plains");
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

}

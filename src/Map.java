public class Map {
    // Map Class builds the map and gives the starting room to the Adventure class

    private Room starterRoom;

    // TODO den opfanger ligesom ikke rigtig descriptionofroom
    // Different Rooms with name and description, creating room objects
    // Rooms created
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

        // Items
        Item lighter = new Item ("Lighter");
        Item smallKey = new Item ("Small key");
        Item bottle = new Item ("Glass bottle");
        Item torch = new Item ("Torch");
        Item machine_gun = new Item ("Machine gun");
        Item rifles = new Item ("Rifles");
        Item knives = new Item ("Knives");
        Item pistol = new Item ("Pistol");
        Item ammunition = new Item ("Ammunition");

        // Food item
        Food banana = new Food("Banana", 20);
        Food gummy_bear_flower = new Food("Gummy-bear-flower", -85);
        Food chocolate_liquid = new Food("Liquid hocolate", -85);
        Food bread = new Food("Bread", 30);
        Food apple = new Food("Apple", 30);
        Food tomato = new Food("Tomato", 30);
        Food water = new Food("Water", 50);

        //Setting directions for each room
        //Room 1
        room1.setEast(room2);
        room1.setSouth(room3);

        //Room 2
        room2.setWest(room1);
        room2.setEast(room3);

        //Room 3
        room3.setWest(room2);
        room3.setSouth(room6);

        //Room 4
        room4.setNorth(room1);
        room4.setSouth(room7);

        //Room 5
        room5.setSouth(room8);

        //Room 6
        room6.setNorth(room3);
        room6.setSouth(room9);

        //Room 7
        room7.setNorth(room4);
        room7.setEast(room8);

        //Room 8
        room8.setNorth(room5);
        room8.setWest(room7);
        room8.setEast(room9);

        //Room 9
        room9.setNorth(room6);
        room9.setWest(room8);

        //Setting starterRoom to room1 at the start
        starterRoom = room1;
    }

    public Room getStarterRoom(){
        return starterRoom;
    }

}

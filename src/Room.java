import java.util.ArrayList;

public class Room {

    //I room finder man getter og setter

    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private String nameOfRoom;
    private String descriptionOfRoom;
    private ArrayList<Item> items = new ArrayList<>();

    //Items of room1
    Item bananas = new Item("Bananas");
    Item water = new Item("Water");
    Item lighter = new Item("Lighter");

    //Items of room2
    Item smallKey = new Item("Small key");
    Item bottle = new Item("Bottle");

    //items of room3
    Item torch = new Item("Torch");

    public void addItem(String itemName){
        Item itemList = new Item(itemName);
        items.add(itemList);
    }
    public ArrayList<Item>getItems(){
        return items;
    }

    public Room(String name) {
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
        this.nameOfRoom = name;
        this.descriptionOfRoom = descriptionOfRoom;
    }

    public Room getNorth() {
        return north;
    }

    public Room getSouth() {
        return south;
    }

    public Room getEast() {
        return east;
    }

    public Room getWest() {
        return west;
    }

    public String getNameOfRoom(){
        return nameOfRoom;
    }

    public String getDescriptionOfRoom(){
        return descriptionOfRoom;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast (Room east){
         this.east=east;
    }

    public void setWest (Room west){
         this.west=west;
    }

}










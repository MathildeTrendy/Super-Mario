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

    //Items of room2 (skal i map)
    Item bananas = new Item("Bananas");
    Item water = new Item("Water");
    Item lighter = new Item("Lighter");

    //Items of room3(skal i map)
    Item smallKey = new Item("Small key");
    Item bottle = new Item("Bottle");

    //items of room4 (skal i map)
    Item torch = new Item("Torch");

    //Items of room6 (skal i map)
    Item weapon = new Item("Weapon");
    Item machine_gun = new Item("Machine gun");
    Item rifles = new Item("Rifle");
    Item knives = new Item("Knive");
    Item pistols = new Item("Pistol");
    Item ammunition = new Item("Ammunition");

    //Item of room8 (skal i map)
    Item gummy_bear_flower = new Item("Gummy-bear-flower");
    Item chocolate = new Item("Lipud chocolate");

    //Item of room9 (skal i map)
    Item bread = new Item("Bread");
    Item Apple = new Item("Apples");
    Item Tomato = new Item("Tomato");


    public void addItem(String itemName){
        Item itemList = new Item(itemName);
        items.add(itemList);
    }
    public ArrayList<Item>getItems(){
        return items;
    }

    public Item findItem (String itemName){
        for (Item item:items) {
            if (itemName.equals(item.getItemName()))
                return item;

        }
        return null;
    }

    public Item removeItem(String name){
        for (Item item: getItems()){
            if (item.getItemName().equals(name)){
                getItems().remove(item);
                return item;

            }
        }
        return null;
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


//vi skal have en removeItem og den sal loope igennem dine nuværende items







import java.util.ArrayList;

public class Player {

    private Room currentRoom;
    private ArrayList<Item> playerInventory = new ArrayList<>();
    private double health;
    private final double maxhealth = 100;

    public Player(){
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom){
        this.currentRoom = currentRoom;
    }


    public boolean goNorth() {
        if (currentRoom.getNorth() == null) {
            return false;

        } else {
            currentRoom = currentRoom.getNorth();
            return true;
        }
    }

    public boolean goEast() {
        if (currentRoom.getEast() == null) {
            return false;

        } else {
            currentRoom = currentRoom.getEast();
            return true;

        }
    }

    public boolean goWest() {
        if (currentRoom.getWest() == null) {
            return false;
        } else {
            currentRoom = currentRoom.getWest();
            return true;
        }
    }

    public boolean goSouth() {
        if (currentRoom.getWest() == null) {
            return false;

        } else {
            currentRoom = currentRoom.getSouth();
            return true;
        }
    }


    public boolean move(String direction) {
        Room requestedRoom = null;

        if (direction.charAt(0) == 'n') {
            requestedRoom = currentRoom.getNorth();
        } else if (direction.charAt(0) == 's') {
            requestedRoom = currentRoom.getSouth();
        } else if (direction.charAt(0) == 'e') {
            requestedRoom = currentRoom.getEast();
        } else if (direction.charAt(0) == 'w') {
            requestedRoom = currentRoom.getWest();
        }

        if (requestedRoom != null) {
            currentRoom = requestedRoom;
            return true;
        } else {
            return false;
        }
    }


    public ArrayList<Item> getPlayerInventory() {
        return playerInventory;
    }
    public void addItem (Item item){
        playerInventory.add(item);
    }

    // mETHOD FOR REMOVING ITHEM PLAYER IN - LOOP THORGJ THE INV
    public Item removeItem(String name){
        Item found = currentRoom.findItem(name);

        for (Item item:playerInventory){
            if (item.getItemName().equals(name)){
                playerInventory.remove(item);
                return item;

            }
        }
        return null;
    }

}




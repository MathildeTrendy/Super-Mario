public class Adventure {
// This class is the controler for the whole game, but does not control the player

    //Field - term for multiple attributes
    private Map map;
    private Player player;
    public enum tryEat {FOOD_NOT_FOUND, IS_NOT_FOOD, YOU_EAT}

    // Adventure constructer, creating the map, player, and setting players currentRoom to starterRoom
    public Adventure(){
        map = new Map();
        map.createRooms();
        player = new Player();
        player.setCurrentRoom(map.getStarterRoom());
    }

    public Player getPlayer(){
        return player;
    }

    // Getter for players current room
    public Room getCurrentRoom(){
        return player.getCurrentRoom();
    }

    // Setter for players current room
    public Room getStarterRoom(){
        return map.getStarterRoom();
    }

    // Calling move method from the class Player
    public boolean go(String direction){
        return player.move(direction);
    }

    public Item takeInventory(String itemName){
        return player.takeInventory(itemName);
    }

    public Item takeItem(String itemName){
        return player.takeItem(itemName);
    }

    public Item dropItem(String itemName){
        return player.dropItem(itemName);
    }

    public ReturnMessage playerEat(String itemName){
        return player.eatFood(itemName);
    }
}


public class Adventure {


    private Map map;
    private Player player;


    public Adventure(){
        map = new Map();
        map.createRooms();
        player = new Player();
        player.setCurrentRoom(map.getStarterRoom());
    }

    public Player getPlayer(){
        return player;
    }


    public enum ReturnMessage{
        NOT_FOUND,
        CANT,
        OK
    }

    public Room getCurrentRoom(){
        return player.getCurrentRoom();
    }
    public boolean goNorth(){
        return player.goNorth();
    }
    public boolean goEast() {
        return player.goEast();
    }
    public boolean goWest(){
            return player.goWest();
        }
    public boolean goSouth(){
        return player.goSouth();
    }
    public Room getStarterRoom(){
        return map.getStarterRoom();
    }




    }



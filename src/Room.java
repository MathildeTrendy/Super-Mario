public class Room {

    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private String name;
    private String des;


    public Room(String name, String des) {
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
        this.name = name;
        this.des = des;
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

    public String getName(){
        return name;
    }

    public String getDes(){
        return des;
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










public class Food extends Item {
//the term `extends` - expresses the connection within the attributes of the class Room

    private double healthPoints;

    public Food(String itemName, String description, double healthPoints) {
        super(itemName,description);
        this.healthPoints = healthPoints;
    }

    public double getHealthPoints (){
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints){
        this.healthPoints = healthPoints;
    }




}

public class Food extends Item {

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

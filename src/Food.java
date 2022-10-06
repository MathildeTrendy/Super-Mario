public class Food extends Item {
//the term `extends` - expresses the connection within the attributes of the class: Room

    private int healthPoints;

    public Food(String itemName, String description, int healthPoints) {
        super(itemName,description);
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints (){
        return healthPoints;
    }

    public void setHealthPoints(){
        this.healthPoints = healthPoints;
    }




}

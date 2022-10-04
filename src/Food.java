public class Food extends Item {


    public int healthPoints;

    public Food(int healthPoints, String name, String description) {
        super(name);
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints (){
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints){
        this.healthPoints = healthPoints;
    }


}

public class Item {

    //Field - term for multiple attributes
    private String itemName;
    private String description;

    public Item(String itemName, String description){
        this.description = description;
        this.itemName = itemName;
    }

    public String getItemName(){
        return itemName;
    }
    public void setItemName(){
        this.itemName = itemName;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(){
        this.description = description;
    }

    @Override
    public String toString(){
        return itemName + "\n" + description;
    }

}

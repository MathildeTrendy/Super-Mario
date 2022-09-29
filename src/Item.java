public class Item {

    private String itemName;
    private String description;

    public Item(String itemName){
        this.itemName = itemName;
    }

    public Item(String description, String itemName){
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

    public String toString(){
        return itemName + "\n" + description;
    }

}

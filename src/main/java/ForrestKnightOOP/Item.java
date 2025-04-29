package ForrestKnightOOP;

public class Item {
        // Attributes
    /* These are private variables that
    are only accessible within this class
    and are kept safe from outside */
    private String name;
    private int quantity;

    // Constructor
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        //this. is used to refer to the current object
        /* this. keyword is java allowing you to have your parameter being
        the same name as your attributes
         */
    }


    //Getter methods
    // These methods allow you to
    // access and modify the private attributes of the class

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
    @Override
    public String toString(){
        return "Item: " + name + ", Quantity: " + quantity;
    }
}

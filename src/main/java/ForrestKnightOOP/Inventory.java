package ForrestKnightOOP;

import java.util.ArrayList;

public class Inventory {
    //Collection of items of non-primitive data types
    private ArrayList<Item> items;

    //Constructor
    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayInventory() {
        // Loop through the items in the inventory
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

}

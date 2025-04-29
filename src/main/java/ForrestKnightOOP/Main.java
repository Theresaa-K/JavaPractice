package ForrestKnightOOP;

public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        // Create some items
        Item item1 = new Item("Enchanted sword", 1);
        Item item2 = new Item ("Healing potion",10);
        Item item3 = new Item ("Apple pie", 5);
        Item item4 = new Item("Throwing Knifes",20);
        Item item5 = new Item("Smoke bomb", 3);
        Fruit fruit = new Fruit ("Ataulfo","Mango",5);
// Add items to the inventory
        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(item3);
        inventory.addItem(item4);
        inventory.addItem(item5);
        inventory.addItem(fruit);


        inventory.displayInventory(); // Display the inventory
    }

}

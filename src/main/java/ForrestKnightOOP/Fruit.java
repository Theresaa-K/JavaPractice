package ForrestKnightOOP;

public class Fruit extends Item {
    private String type;

    public Fruit(String type,String name, int quantity) {
        super(name, quantity);
        this.type = type;
    }


}

package behaviours;


public enum Suit {

    SPADES("spades"),
    HEARTS("hearts"),
    CLUBS("clubs"),
    DIAMONDS("diamonds");

    private String name;

    Suit (String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

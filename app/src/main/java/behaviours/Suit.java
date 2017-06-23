package behaviours;


public enum Suit {

    SPADES("spades"),
    DIAMONDS("diamonds"),
    HEARTS("hearts"),
    CLUBS("clubs");

    private String name;

    Suit (String type){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

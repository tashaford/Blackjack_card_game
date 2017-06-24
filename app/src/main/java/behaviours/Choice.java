package behaviours;


public enum Choice {
    TWIST("twist"),
    STICK("stick");

    private String type;

    Choice(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}
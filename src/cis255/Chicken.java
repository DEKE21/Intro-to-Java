package cis255;

public class Chicken implements Animal {
    private String type;
    private String sound;
    public Chicken(){
        type = "Chicken";
        sound  = "cluck";
    }
    public String type(){
        return type;
    }
    public String sound(){
        return sound;
    }
}

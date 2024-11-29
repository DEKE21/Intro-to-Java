package cis255;

public class Pig implements Animal {
    private String type;
    private String sound;
    public Pig(){
        type = "Pig";
        sound = "oink";
    }
    public String type(){
        return type;
    }
    public String sound(){
    return sound;
    }
}

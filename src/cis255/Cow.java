package cis255;

public class Cow implements Animal {
    private String type;
    private String sound;
    public Cow(){
        type = "Cow";
        sound = "moo";
    }
    public String type(){
        return type;
    }
    public String sound(){
        return sound;
    }
}


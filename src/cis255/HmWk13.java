package cis255;

import java.util.ArrayList;
import java.util.List;

public class HmWk13 {
   public static void main(String[] args) {
   List<Animal> animals = new ArrayList<Animal>();
   Animal Cow = new Cow();
   Animal Chicken = new Chicken();
   Animal Pig = new Pig();  
   animals.add(Cow);
   animals.add(Chicken);
   animals.add(Pig);
   for(Animal a: animals){
    System.out.println("Type: " + a.type() + " Sound: " + a.sound());
   }
   }
}

package cis255;
import java.util.Scanner;

public class pj3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight;
        System.out.println("hello, please enter your weight");
        weight = input.nextDouble();
        input.close();
        if(weight > 0 && weight <=50){System.out.println("Eat more");}
        else if(weight > 50 && weight <= 100) {System.out.println("I hope you are short");} 
        else if(weight > 100  && weight <= 200) {System.out.println("Quite average");}
        else if(weight >200 && weight <= 300 ){System.out.println("I hope you are tall");}
        else if(weight > 300 && weight <= 500) {System.out.println("Into sumo?");}
        else{System.out.println("You liar"); };

        System.out.println("Good Bye");
     
    }
}

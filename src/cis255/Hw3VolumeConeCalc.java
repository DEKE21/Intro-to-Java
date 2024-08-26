package cis255;
import java.util.Scanner;
import java.lang.Math;
public class Hw3VolumeConeCalc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the Height: ");
        double h = input.nextDouble();
        System.out.print("enter the Radius: ");
        double r = input.nextDouble();
        input.close();
        double v = Math.PI *h *(r*r);
        System.out.print("the volume is: " +  v);

    };
}

package cis255;
import java.util.Scanner;
import java.lang.Math;
public class Hw3CircumferenceCalc {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the radius");
         double r = input.nextDouble();
         input.close();
         double c = 2* Math.PI * r;
         System.out.println(c);

         
    }
}

package cis255;
import java.util.Scanner;
public class pj6 {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Double x, y,z;
    int a,b;
    System.out.println("enter a double");
    x = input.nextDouble();
    System.out.println("enter a double");
    y = input.nextDouble();
    System.out.println("enter a double");   
    z = input.nextDouble();
    System.out.println("enter a integer");
    a = input.nextInt();
    System.out.println("enter a integer");
    b = input.nextInt();
    input.close();
    min(x, y, z);
    average(a, b);
   }
   public static void min(double x, double y,  double z){
    if(x < y && x < z)  System.out.println("The Smallest value is " + x);
    else if(y < x && y < z) System.out.println("The Smallest value is " + y);
    else if(z < x && z < y) System.out.println("The Smallest value is " + z);

   }
   public static void average(int a, int b){
    int sum = a +b;
    System.out.println("The average is "+ sum/2 );
   } 

}

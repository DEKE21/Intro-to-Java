package cis255;

import java.util.Scanner;

public class hw6_2 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the Height");
      double Height = input.nextDouble();
      System.out.println("Enter the radius");
      double Radius = input.nextDouble();
      input.close();  
      showVolume(Height, Radius);
        }
    public static void showVolume(double H, double R){
        double _PI = Math.PI;
        double volumeSum = _PI * H* R*R;
        System.out.println("the Volume is "+ volumeSum);
    }
}
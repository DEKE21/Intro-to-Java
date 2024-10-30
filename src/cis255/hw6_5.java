package cis255;

import java.util.Scanner;

public class hw6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter the numerator");
        double xValue = input.nextDouble();
        System.out.println("Enter the denominator");
        double yValue = input.nextDouble();
        input.close();
        showRatio(xValue, yValue);
    }
    public static void showRatio(double x, double y){
        double sum = x / y;
        System.out.println(sum);
    }
}

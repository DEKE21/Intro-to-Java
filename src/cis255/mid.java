package cis255;

import java.util.Scanner;

public class mid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first base");
        int base1 = input.nextInt();
        System.out.println("Input the second base");
        int base2 = input.nextInt();
        System.out.println("Input the height");
        int height = input.nextInt();
        input.close();
        double area = ((base1 + base2)/2) * height;
        System.out.println("The area is " + area);

    }
}

package cis255;
import java.util.Scanner;

public class pj4 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("*****************************************");
    System.out.println("             * MENU *");
    System.out.println("*****************************************");
    System.out.println("* 1 - Increment a number by 1. *");
    System.out.println("* 2 - Check if a number is odd or even. *");
    System.out.println("* 3 - Decrement a number by 1. *");
    System.out.println("* 4 - Sum 2 numbers. *");
    System.out.println("*****************************************");
    System.out.println("");
    System.out.println("Enter your selection");
    int choice = input.nextInt();
    
switch (choice) {
    case 1:
       System.out.println("Enter a integer");
       int incr = input.nextInt();
       incr = incr + 1;
       System.out.println("The incremented number is "+ incr);
        break;
    case 2:
    System.out.println("Enter a integer");
    int num = input.nextInt();
    if (num %2 == 0 ){
        System.out.println("Entered Number is even");
    }
    else{
        System.out.println("Entered number is odd");
    }

    break;
    case 3:
    System.out.println("Enter a integer");
    int decr = input.nextInt();
        decr = decr -1;
        System.out.println("The decremented number is " + decr);
    break;
    case 4:
    System.out.println("Enter a integer");
       int n1 = input.nextInt();
       System.out.println("Enter another integer");
       int n2 = input.nextInt();
       int sum = n1+n2;
       System.out.println("The sum of the two numbers is "+ sum);
    break;


    default:
    System.out.println("This is an invalid menu option!");
        break;
}
    input.close();
    }
    
}

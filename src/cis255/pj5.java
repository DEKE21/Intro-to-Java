package cis255;

import java.util.Scanner;

public class pj5 {
    public static void main(String[] args){
    double D = 14.99;
    double B = 19.99;
    double K = 26.99;
    double T = 0.09;
    double sub = 0;
    double total;
    
    System.out.println("Do you want to rent a movie? ");
    Scanner input = new Scanner(System.in);

    char responce = input.next().charAt(0);

if(responce == 'Y' || responce == 'y'){
    System.out.println("\nDVD, Blu-ray, or 4K UHD? [D, B, or U]: ");
    char ch = input.next().charAt(0);
    switch (ch) {
        case 'B' ,'b':
            System.out.printf("\nYou added a DVD to your cart for $%.2f.\n", D);
            sub =+ D;
            break;
        case 'D','d':
            System.out.printf("\nYou added a Blue-ray movie to your cart for$%.2f.\n" ,B);
            sub =+B;
            break;
        case 'U','u':
            System.out.printf("\nYou added a 4K UHD movie to your cart for$%.2f.\n",K);
            sub =+K;
            break;
        default:
            System.out.println("\nYou made an invalid selection!");
            break;
    }
    total = (sub*T) + sub;
    System.out.printf("\nYour cart subtotal is $%.2f.\n",sub);
    System.out.printf("\nAfter a tax rate of %.1f%% is added to the subtotal,\n", T);
    System.out.printf( "a charge of $%.2f will be applied to your credit card.\n",total);

}
else{
    System.out.println("\nWe are sorry that you are not interested.");

};
    System.out.println("\nThank you for shopping. Goodbye!");
    input.close();


}
}
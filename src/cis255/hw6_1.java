package cis255;
import java.util.Scanner;

public class hw6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alpha;
        int beta;
        int gamma;
        System.out.println("Enter a integer");
        alpha = input.nextInt();
        System.out.println("Enter another integer");
        beta = input.nextInt();
        System.out.println("Enter another integer");
        gamma =input.nextInt();
        input.close();
        showMax(alpha, beta, gamma);
    }
    public static void showMax(int a,int b, int c){
        if(a>b && a>c) System.out.println("The biggest Integer is: " +a);
        if(b>a && b>c) System.out.println("The biggest Integer is: " +b);
        if(c>a && c>b) System.out.println("The biggest Integer is: " +c);

    }
}

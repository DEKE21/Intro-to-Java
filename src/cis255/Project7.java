package cis255;
import java.util.Scanner;
public class Project7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double vals[] = new double[5];
        for(int i =0; i < 5; i++){
            System.out.println("Enter a value");
            vals[i] = input.nextInt();
        }
        input.close();
        System.out.println(max(vals));
        double rs[] = reverse(vals);
        for(int i =0; i < vals.length; i++){
            System.out.println(rs[i]);
        }
     }
     public static double max(double a[]){
        int x = 0;
        for(int i =0; i < a.length; i++){
            if(a[x] < a[i]){
                x++;
            }
        }

        return a[x];
    }
     
     public static double[] reverse(double a[]){
        double rev[] = new double[a.length];
        int incr =0;
        for(int i = a.length; i > 0; i--){
            rev[incr] += a[i-1];
            incr +=1;
     }
     return rev;
}
}
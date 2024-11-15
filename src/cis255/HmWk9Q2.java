package cis255;
import java.util.Scanner;
public class HmWk9Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String you want reversed");
        String str = input.next();
        input.close();
        System.out.println(reverse(str));
    }
    public static String reverse(String val){
        String revstr ="";
        for(int i = val.length(); i > 0; i--){
            revstr += val.charAt(i-1);
        }
        return revstr;
    }

}


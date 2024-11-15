package cis255;

import java.util.Scanner;

public class HmWk9Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("Enter the password");
        String key = input.next();
        input.close();
        if(key.equals(args[0])){
            System.out.println("PERMISSION GRANTED!");
        }else{
            System.out.println("INVALID VALUE!");
            System.out.println("TRY AGAIN!");
        }
    
    
        }while(true);
        
    }
}

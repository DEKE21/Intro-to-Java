package cis255;
import java.util.Scanner;

public class hw5_3 {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        System.out.println("String");
        String sent =  input.next();
        System.out.println("int");
        Integer numb = input.nextInt();
        input.close();
        for(int i = 0; i < numb; i++ ){
            System.out.println(sent);
        }

        
    }
}
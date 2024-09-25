package cis255;

import java.util.Scanner;

// The instructions on this prompt were confusing me so I hope I did the right thing
public class hw5_6 {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        System.out.println("String");
        String decr =  input.next();
        System.out.println("int");
        Integer numb = input.nextInt();
        input.close();
        
            for(int i=numb; i < 10; i--  ){
                if(i >1) System.out.println(i);
                else if (i== 0) System.out.println(decr);
            }
            for(int i = numb; i >= 10; i--){
                if(i>10) System.out.println(i);
                else if(i == 10)System.out.println(decr);
            }
            
    }}

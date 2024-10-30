package cis255;

import java.io.IOException;

public class hw5_5 {
    public static void main(String[] args) {
        try{
          do{ 
            char input = (char)System.in.read();
            if(input == '\n'){
            break;

           }else if (input >= 'A' && input <= 'Z'){
        	   input  += 32;
            System.out.print(input);
           }else{
            System.out.print(input);
          }
        
        
        }while(true);
        }
        catch(IOException ioe){}
    }
}

package cis255;

import java.io.IOException;

public class hw5_2 {
    public static void main(String[] args) {
        try{
          do{ 
            char input = (char)System.in.read();
            if(input == '\n'){
            break;

           }else if (input >= 'a' && input <= 'z'){
            System.out.print(input);
           }else{
            continue;
           }
        
        
        }while(true);
        }
        catch(IOException ioe){}
    }
}

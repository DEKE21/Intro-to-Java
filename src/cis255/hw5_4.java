package cis255;

import java.io.IOException;

public class hw5_4 {
    public static void main(String[] args) {
 char input;   
try{
  while((input = (char)System.in.read()) != '\n'){
      if(input == '@' || input == '!' || input == '$'){
        continue;
    }
       else { System.out.print(input); 
      }
      
    } 
    }catch(IOException ioe){
      System.err.println("ioe");
    }
}

}   


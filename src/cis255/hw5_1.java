package cis255;

import java.io.IOException;
public class hw5_1 { 
public static void main(String[] args) {
 char input;   
try{
  while((input = (char)System.in.read()) != '\n'){
      if(input == ' ' || input == '\011'){
          System.out.print("=");

    }
       else { System.out.print(input); 
      }
      
    } 
    }catch(IOException ioe){
      System.err.println("ioe");
    }
}

}   
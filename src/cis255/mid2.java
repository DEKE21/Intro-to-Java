package cis255;

public class mid2 {
    public static void main(String[] args) {
           int x = 7;
           int y = 1;
           if (x != y) { 
                x *= y++;         
            }                   
            if (y <= x) {   
                y *= x;        
             } else {   
              x *= y;      
                }        
            if (x != y) {   
              y = y/ (y / x);    
             }         
            System.out.println("x: " + x);
            System.out.println("y: " + y); 
    }
}

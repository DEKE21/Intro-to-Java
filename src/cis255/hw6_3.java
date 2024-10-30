package cis255;

import java.util.Scanner;

class hw6_3 {
    public static void main(String[] args){        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        char character = input.next().charAt(0);
        System.out.println("Enter a setence");
        String sentence = input.next();
         input.close();
        draw(character, sentence);
}
    public static void  draw(char ch, String n ){
        int occur =0;
        int index = 0;
        int strLength = n.length();
        while (index != strLength) {
        if(ch == n.charAt(index)){
            occur +=1;
            index +=1;
        }else if(ch != n.charAt(index)){
            index +=1;
        }}
// i wasnt sure which one it was asking so i did both
    System.out.println(occur);
    for(int i = 0; i < occur; ++i){
        System.out.println(ch);
    }
    }
}

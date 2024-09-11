package cis255;

public class Hw4B {
    public static void main(String args[]) {
        int gamma = 3;
        int delta = 4;
        if (gamma == delta) {
        gamma--;
        } else if (gamma < delta) {
        gamma += 2;
        delta += 2;
        }
        System.out.println(delta + " " + gamma);
        }
        
}

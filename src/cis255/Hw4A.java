package cis255;

public class Hw4A {
/*
*p = true, q = true, r = false, s = false 
*a.) (p || r) && (q || s)  true or false and true or false
*b.) !p || s && q || r not equal to true or false and true or false
*c.) (p && r) || (q && s) true and false or true and false
*d.) !(p && q && r) not equal to true and false or true and false
*/

public static void main(String args[]) {
    int alpha = 2;
    int beta = 5;
    if (alpha > beta) {
    alpha++;
    }
    if (alpha <= beta) {
    System.out.println(alpha);
    } else {
    System.out.println(beta);
    }
    System.out.println(alpha + "" + beta);
    }
}

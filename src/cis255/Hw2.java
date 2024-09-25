package cis255;

/*
a.) Total 2  error
b.) TOTAL legal 
c.) Total2 legal 
d.) #Total  error
e.) _Total2 legal 
f.) Total legal 
g.) 2total error
h.) Total_2 legal error
i.) T legal
j.) return error
*/
public class Hw2 {
int weight;
double account_balance;
char Middle_initial;
boolean Married;
String Gender;

public static void main(String args[]) {
int a = 7;
int b = 2;
int c = 031;
int d = 0x13;
char e = 'A';
char f = 'a';
System.out.println("a. " + (a / b) + " " + (a % b));
System.out.println("b. " + c + " " + d);
System.out.println("c. " + (e + 1) + " " + (char)(e + 1));
System.out.println("d. " + (f + 3) + " " + ('f' + 3));
};
}
/* MEMORY
 * a 7 
 * b 2
 * c 25
 * d 19
 * e 'A'
 * f 'a'
 * 
 */
/* SCREEN
 * a. 3 1
 * b. 25 19
 * c. 66 B
 * d. 100 105 
 */
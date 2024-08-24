package cis255;

public class DisplayVariables {
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
}
}

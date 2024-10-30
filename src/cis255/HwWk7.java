package cis255;

public class HwWk7 {
public static void main(String args[]) {
double list [] = new double[4];
double value;
value = 7.0;
list[0] = 6.5;
list[3] = 3.8;
list[1] = value;
list[2] = list[0] + list[3];
for (int i = 0; i < list.length; i++) {
System.out.println(list[i]);
}
System.out.println("Done");
}
}
    
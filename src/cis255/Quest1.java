package cis255;

/*
* John Oldguy
* File: Quest1.java
*/
public class Quest1 {
public static void main(String args[]) {
final float pricePerSquareFoot = 11.50f;
int length, width, area;
float totalPrice;
length = 20;
width = 12;
area = length * width;
totalPrice = area * pricePerSquareFoot;
System.out.println("The total cost is $" + totalPrice);
}

}

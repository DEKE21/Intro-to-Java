package cis255;

/* 
* John Newguy
* File: Quest2.java
*/
public class Quest2 {
public static void main(String args) {
final float _1PRICE_PER_SQUARE_FOOT = 13.99f;
int length1, _width, Area;
float totalPrice;
length1 = 15;
_width = 8;
Area = length1 * _width;
totalPrice = Area * _1PRICE_PER_SQUARE_FOOT;
System.out.println("The total cost is $" + totalPrice);
}
}


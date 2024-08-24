package cis255;

/*
* John Diffguy
* File: Hw1Notes2.java
*/

public class Hw1Notes2 {
public static void main(String[] args) {
final float NUM_PEOPLE = 3f;
final float INCHES_IN_FOOT = 12f;
float height1, height2, height3;
float avgHeightInches;
float avgHeightFeet;
height1 = 54f;
height2 = 79f;
height3 = 68f;
avgHeightInches = (height1 + height2 + height3) / NUM_PEOPLE;
System.out.println("The average height in inches is " + avgHeightInches);
avgHeightFeet = avgHeightInches / INCHES_IN_FOOT;
System.out.println("The average height in feet is " + avgHeightFeet);
};
}

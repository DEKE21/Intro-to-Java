package cis255;

import java.util.Scanner;

public class Hw3Weightconvert {
		public static void main(String[] args) {
		double k;
		double p;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the weight in kg");
		k = in.nextDouble();
		in.close();
		p = k *2.2;
		System.out.println("The conversion to pounds is "+ p);

		};}


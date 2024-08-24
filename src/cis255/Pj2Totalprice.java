package cis255;

public class Pj2Totalprice {
public static void main(String[] args) {
	double var1 = 1.98;
	double var2 = 1.98;	
	double var3 = 1.98;
	double var4 = 1.98;
	double var5 = 1.98;
	double sum = var1+var2+var3+var4+var5;
	sum+= (sum * 0.04);
	
	 	 
	System.out.println(String.format("%.2f",sum));
	
};
}

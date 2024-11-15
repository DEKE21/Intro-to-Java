package cis255;

public class Table {
    private String color;
    private double length;
    private double width;
    private double height;
    private int numChairs;

    public Table() {}
    public Table(String color, double length, double width, double height, int numChairs) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
        this.numChairs = numChairs;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public int getNumChairs() {
        return numChairs;
    }
    public void setNumChairs(int numChairs) {
        this.numChairs = numChairs;
    }
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\nColor:  " +color);
        buffer.append("\nlength: "+ length);
        buffer.append("\nWidth:  "+ width);
        buffer.append("\nHeight:  " + height);
        buffer.append("\nChairs:  "+ numChairs);
        return buffer.toString();
    }
    public static void main(String[] args) {
        Table t1 = new Table();
        t1.setColor("Brown");
        t1.setLength(2.5);
        t1.setWidth(1.5);
        t1.setHeight(0.75);
        t1.setNumChairs(4);
        Table t2 = new Table("White", 3.0, 2.0, 1.0, 6);
        System.out.println("Table 1 " +t1);
        System.out.println("Table 2 " +t2);
    }  
}

package cis255;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Cat {
    private String color;
    private String breed;
    private Date birthday;
    private double weight;
    public Cat() {}
    public Cat(String color, String breed, Date birthday, double weight) {
        this.color = color;
        this.breed = breed;
        this.birthday = birthday;
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getFormattedBirthday() {
        SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
        return sdf.format(birthday);
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getAgeInYears() {
        Calendar birthCal = new GregorianCalendar();
        birthCal.setTime(birthday);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - birthCal.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < birthCal.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\nColor:  "+color);
        buffer.append("\nBreed:  " + breed);
        buffer.append("\nBirthday:  " +birthday);
        buffer.append("\nWeight:  " +weight);
        return buffer.toString();
     }

    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar(2010, Calendar.JULY, 15);
        Date birthday = cal.getTime();    
        Cat c1 = new Cat();
        c1.setColor("Black");
        c1.setBreed("Siamese");
        c1.setBirthday(birthday);
        c1.setWeight(8.5);

        Cat c2 = new Cat("Black", "Siamese", birthday, 8.5);
        System.out.println(c1);
        System.out.println("Age in years: " + c1.getAgeInYears());
        System.out.println(c2);
        System.out.println("Age in years: " + c2.getAgeInYears());
    }
}
 
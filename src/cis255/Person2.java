package cis255;

public class Person2 {
    private String firstName = null;
    private String lastName = null;
    private String city = null;
    private String state = null;
    private int zip = 0;
    private String phoneNumber = "0";
    public Person2(){}
    public Person2(String firstName,String lastName, String city ,String state,int zip,String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;        
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setZip(int zip){
        this.zip = zip;        
    }
    public void setNum(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getFirstName(){
        return firstName;

    }
    public String getLastName(){
        return lastName;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public int getZip(){
        return zip;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("\nFirst name:  " +firstName);
        buffer.append("\nLast name:  "+ lastName);
        buffer.append("\nCity:  "+ city);
        buffer.append("\nState:  " + state);
        buffer.append("\nzip:  " +zip);
        buffer.append("\nPhoneNumber:  " + phoneNumber);
        return buffer.toString();
    }
    public static void main(String[] args) {
        Person2 p = new Person2();
        p.setFirstName("fname");
        p.setLastName("lName");
        p.setCity("City");
        p.setState("state"); 
        p.setZip(12345);
        p.setNum("123456789123");
        System.out.println("Person one (empty const) " + p);
        Person2 p2 = new Person2("fname", "lName", "city", "state", 0, "12346789123");
        System.out.println("Person2 "+p2);

    }
}

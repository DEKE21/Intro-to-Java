package cis255;


public class President {
    private int id;
    private String lastName;
    private String firstName;
    private char mInitial;

     public President() {}
     public President(int id, String lastName, String firstName, char mInitial) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.mInitial = mInitial;
     }
     public int getId() {
        return id;
     }
     public void setId(int id) {
        this.id = id;
     }
     public String getLastName() {
        return lastName;
     }
     public void setLastName(String lastName) {
        this.lastName = lastName;
     }
     public String getFirstName() {
        return firstName;
     }
 
     public void setFirstName(String firstName){
        this.firstName = firstName;
     }
      public char getMiddleInitial(){
        return mInitial;
     }
 
     public void setMiddleInitial(char mInitial){
        this.mInitial = mInitial;
     }
     public String toString(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("\nPresident");
        buffer.append("\nid: " + id);
        buffer.append("\nlastName: " +lastName);
        buffer.append("\nfirstName: " +firstName);
        buffer.append("\nmiddleInitial: "+ mInitial);
        return buffer.toString();

     }
}
package cis255;

public class Student extends Person {
    private int studentID;
    private boolean isOnCampus;
    private int numClassesTaken;
    public Student(){}
    public Student(String name, int age, int studentID, boolean isOnCampus, int numClassesTaken){
        super(name, age);
        this.studentID = studentID;
        this.isOnCampus = isOnCampus;
        this.numClassesTaken = numClassesTaken;
    }
    @Override 
    public void play(){
        System.out.println("I cannot play. I am studying.");
    }
    @Override
    public void talk(){
        System.out.println("No time to talk so stop bothering me.");
    }
    public void setStudentID(int id){
        this.studentID = id;
    }
    public int getStudentID(){
        return(studentID);
    }
    public void setOnCampus(boolean oncampus){
        this.isOnCampus = oncampus;
    }
    public boolean getIsOnCampus(){
        return isOnCampus;
    }
    public void setNumClassesTaken(int classesnum){
        this.numClassesTaken = classesnum;
    }
    public int getNumClassesTaken(){
        return(numClassesTaken);
    }
    @Override
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("\nName: " + name);
        buffer.append("\nAge: " +age);
        buffer.append("\nStudent I.D: "+ studentID);
        buffer.append("\nOn campus? " + isOnCampus);
        buffer.append("\nNumber of classes taken: " + numClassesTaken);
        return (buffer.toString());
    }
}

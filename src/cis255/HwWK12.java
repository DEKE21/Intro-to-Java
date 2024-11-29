package cis255;

public class HwWK12 {
    public static void main(String[] args) {
    String name = "Name namer";
    int age = 54;
    int studentID = 253;
    boolean isOnCampus = false;
    int numClassesTaken = 7;
    Student stud = new Student(name,age,studentID,isOnCampus,numClassesTaken);
    String grade = "Recreational";
    boolean current = true;
    int hours = 1600;
    Pilot pil = new Pilot(name,age,grade, current, hours);
    System.out.println("Student \n"+stud.toString());
    stud.play();
    stud.talk();
    System.out.println("Pilot \n" + pil.toString());
    pil.play();
    pil.talk();
    pil.takeoff();
    pil.landing();
}
    
}
package edu.calhoun.cis.java.intro.exam.exam3;

public class Confidential implements Clearance {
private String acronym;
private String description;
private String impactIfMadePublic;
public Confidential(){
    this.acronym = "C";
    this.description = "Confidential";
    this.impactIfMadePublic = "Damage or be prejudicial to national security";

}
public void showAcronym(){
    System.out.println("Acronym: " + acronym);
}
public void showDescription(){
    System.out.println("Description: " + description);
}
public void showImpactIfMadePublic(){
    System.out.println("Impact if Made Public: " + impactIfMadePublic);
}


}

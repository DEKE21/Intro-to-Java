package edu.calhoun.cis.java.intro.exam.exam3;

public class TopSecret implements Clearance {
    private String acronym;
    private String description;
    private String impactIfMadePublic;
    
    public TopSecret(){
        this.acronym = "TS";
        this.description = "Top Secret";
        this.impactIfMadePublic = "Exceptionally grave damage to national security";
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

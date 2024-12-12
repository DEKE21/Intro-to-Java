package edu.calhoun.cis.java.intro.exam.exam3;

public class Secret implements Clearance {
    private String acronym;
    private String description;
    private String impactIfMadePublic;

    public Secret(){
        this.acronym = "S";
        this.description = "Secret";
        this.impactIfMadePublic = "Serious damage to national security";
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

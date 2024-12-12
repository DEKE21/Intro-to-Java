package edu.calhoun.cis.java.intro.exam.exam3;

import java.util.ArrayList;
import java.util.List;

public class Exam3Q4 {
public static void main(String[] args) {
    Confidential confidential = new Confidential();
    Secret secret = new Secret();
    TopSecret topSecret = new TopSecret();
    List<Clearance> data = new ArrayList<Clearance>();
    data.add(confidential);
    data.add(secret);
    data.add(topSecret);
    for(Clearance c: data){
        c.showAcronym();
        c.showDescription();
        c.showImpactIfMadePublic();
    }
}
}

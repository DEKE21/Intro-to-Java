package edu.calhoun.cis.java.intro.exam.exam3;

import java.util.Date;

public class Exam3Q3 {
public static void main(String[] args) {
    Certification certification = new Certification();
    System.out.println(certification);
    certification.showLevelsForDoD();
    Date date = new Date();
    SecurityPlus securityPlus = new SecurityPlus("Security+", 2.5, date,2);
    System.out.println(securityPlus);
    securityPlus.showLevelsForDoD();
    Date date2 = new Date();
    CISSP cissp = new CISSP("CISSP", 6.0, date2, 10,true);
    System.out.println(cissp);
    cissp.showLevelsForDoD();
}
}

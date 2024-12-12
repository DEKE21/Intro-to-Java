package edu.calhoun.cis.java.intro.exam.exam3;


import java.util.Date;

public class SecurityPlus extends Certification {
private int yearsexperience = 0;
public SecurityPlus() {
}
public SecurityPlus(String certName, double examLengthInHours, Date issueDate,int yearsExperience) {
 super(certName, examLengthInHours, issueDate);
 this.yearsexperience = yearsExperience;

}
 public int GetExperience(){
    return yearsexperience;
 }
 public void setExperience(int years){
    this.yearsexperience = years;
 }

@Override
public void showLevelsForDoD() {
System.out.println("IAT Level II, IAM Level I");
}
@Override
public String toString() {
    StringBuffer buffer = new StringBuffer();
    buffer.append("SecurityCertification [certName=" + getCertName()); 
    buffer.append( ", examLength=" + getExamLengthInHours());
    buffer.append(", issueDate=" + getIssueDate());
    buffer.append(", Years of Experience:" + GetExperience() +"]");
    return(buffer.toString());
}
}

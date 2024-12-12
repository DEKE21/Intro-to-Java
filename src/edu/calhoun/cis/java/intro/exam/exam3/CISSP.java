package edu.calhoun.cis.java.intro.exam.exam3;

import java.util.Date;

public class CISSP extends Certification {
private int yearsexperience =0;
private Boolean attendedbootcamp = null;
public CISSP(){}
public CISSP(String certName, double examLengthInHours, Date issueDate,int yearsExperience, Boolean attendedBootcamp) {
 super(certName, examLengthInHours, issueDate);
 this.yearsexperience = yearsExperience;
 this.attendedbootcamp = attendedBootcamp;
}
 public int GetExperience(){
    return yearsexperience;
 }
 public void setExperience(int years){
    this.yearsexperience = years;
 }
 public Boolean getAttendedBootcamp(){
    return attendedbootcamp;
}
public void setBootcampAttendance(Boolean attended){
    this.attendedbootcamp = attended;
}
@Override
public void showLevelsForDoD() {
System.out.println("IAT Level III, IAM Level III, IASAE II");
}
@Override
public String toString() {
    StringBuffer buffer = new StringBuffer();
    buffer.append("SecurityCertification [certName=" + getCertName()); 
    buffer.append( ", examLength=" + getExamLengthInHours());
    buffer.append(", issueDate=" + getIssueDate());
    buffer.append(", Years of Experience:" + GetExperience());
    buffer.append(", Attended boot camp:" + getAttendedBootcamp() +"]");
    return(buffer.toString());
}
}

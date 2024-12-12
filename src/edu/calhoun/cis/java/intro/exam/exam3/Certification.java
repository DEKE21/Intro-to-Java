package edu.calhoun.cis.java.intro.exam.exam3;
import java.util.Date;
public class Certification {
private String certName = null;
private double examLengthInHours = 0;
private Date issueDate = null;
public Certification() {
}
public Certification(String certName, double examLengthInHours, Date issueDate) {
this.certName = certName;
this.examLengthInHours = examLengthInHours;
this.issueDate = issueDate;
}
public String getCertName() {
return certName;
}
public void setCertName(String certName) {
this.certName = certName;
}
public double getExamLengthInHours() {
return examLengthInHours;
}
public void setExamLengthInHours(int examLengthInHours) {
this.examLengthInHours = examLengthInHours;
}
public Date getIssueDate() {
return issueDate;
}
public void setIssueDate(Date issueDate) {
this.issueDate = issueDate;
}
public void showLevelsForDoD() {
System.out.println("Not qualified to work for DoD");
}
@Override
public String toString() {
return "SecurityCertification [certName=" + certName
+ ", examLength=" + examLengthInHours
+ ", issueDate=" + issueDate + "]";
}
}

package cis255;

import java.util.LinkedList;

public class Project8Q2 {
    private LinkedList<President> presidents;

    public Project8Q2(){
        presidents = new LinkedList<>();
    }
    public void addPresident(int id, String lastName, String firstName, char mInitial){
        President president = new President(id, lastName, firstName, mInitial);
        presidents.add(president);
    }
    public void showPresidents(){
        for (President president : presidents) {
            System.out.println(president);
        }
    }
    public static void main(String[] args){
        Project8Q2 pres = new Project8Q2();
        pres.addPresident(16, "Lincoln", "Abraham", ' '); 
        pres.addPresident(18, "Grant", "Ulysses", 'S'); 
        pres.addPresident(26, "Roosevelt", "Theodore", ' '); 
        pres.addPresident(27, "Taft", "William", 'H'); 
        pres.addPresident(29, "Harding", "Warren", 'G');
        pres.showPresidents();
    }
}

package cis255;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Project8Q3{
    private LinkedHashMap<Integer, President> presidents;

    public Project8Q3(){
        presidents = new LinkedHashMap<>();
    }
    public void addPresident(int id, String lastName, String firstName, char mInitial) {
        President president = new President(id, lastName, firstName, mInitial);
        presidents.put(id, president);
    }
    public void showPresidents() {
        for (Integer key : presidents.keySet()) {
            System.out.println("Key: " + key + ", " + presidents.get(key));
        }
    }
    public void showPresident(int id){
        President president = presidents.get(id);
        if(president != null) {
            System.out.println(president);
        } 
        else{
            System.out.println("President with ID " + id + " not found.");
         }
    }
    public static void main(String[] args){
        Project8Q3 project = new Project8Q3();
        Scanner scanner = new Scanner(System.in);
        project.addPresident(16, "Lincoln", "Abraham", ' ');
        project.addPresident(18, "Grant", "Ulysses", 'S');
        project.addPresident(26, "Roosevelt", "Theodore", ' ');
        project.addPresident(27, "Taft", "William", 'H');
        project.addPresident(29, "Harding", "Warren", 'G');

        while(true){
            System.out.println("Enter a command (G: Get President by ID, D: Display all Presidents, X: Exit):");
            char command = scanner.next().charAt(0);
            scanner.nextLine(); 

            switch(command){
                case 'G':
                    System.out.println("Enter the ID of the president to display:");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    project.showPresident(id);
                    break;
                case 'D':
                    project.showPresidents();
                    break;
                case 'X':
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command. Please enter 'G', 'D', or 'X'.");
            }
        }
}
}


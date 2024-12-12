package edu.calhoun.cis.java.intro.exam.exam3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;     
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Exam3Q5 {

    public void readAtmospheres(List<Atmosphere> atmospheres) {
        FileInputStream fis = null;
        BufferedReader br = null;
        try {
            String line;
            File file = new File(System.getProperty("java.class.path") + System.getProperty("file.separator") + "ATMOSPHERES.DAT");
            fis = new FileInputStream(file);
            br = new BufferedReader(new InputStreamReader(fis));
            while ((line = br.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, " ");
                String id = tokenizer.nextToken();
                String name = tokenizer.nextToken();
                String startHeightInMiles = tokenizer.nextToken();
                String endHeightInMiles;
                 if(tokenizer.hasMoreTokens()){
                    endHeightInMiles = tokenizer.nextToken();}
                      else{ endHeightInMiles ="";};
                Atmosphere atmosphere = new Atmosphere(id, name, startHeightInMiles, endHeightInMiles);
                atmospheres.add(atmosphere);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void displayAtmospheres(List<Atmosphere> atmospheres) {
        for (Atmosphere atmosphere : atmospheres) {
            System.out.println(atmosphere);
        }
    }
    public void addAtmosphere(List<Atmosphere> atmospheres, String id, String name, String startHeightInMiles, String endHeightInMiles) {
        Atmosphere atmosphere = new Atmosphere(id, name, startHeightInMiles, endHeightInMiles);
        atmospheres.add(atmosphere);
    }
    public void writeAtmosphere(List<Atmosphere> atmospheres) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ATMOSPHERES_NEW.DAT"))) { 
            for (Atmosphere atmosphere : atmospheres) { 
                writer.write(atmosphere.getId() + " " + atmosphere.getName()
            + " " + atmosphere.getStartHeightInMiles() + " " 
             + atmosphere.getEndHeightInMiles()); 
             writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();      
        }
    }
public static void main(String[] args) { 
    Exam3Q5 exam = new Exam3Q5(); 
    List<Atmosphere> atmospheres = new ArrayList<>();
    exam.readAtmospheres(atmospheres);
    System.out.println("Atmospheres read from file:"); exam.displayAtmospheres(atmospheres);
    exam.addAtmosphere(atmospheres, "5", "Exosphere", "440", "6200"); 
    exam.writeAtmosphere(atmospheres);  
    System.out.println("\nAtmospheres after adding:"); exam.displayAtmospheres(atmospheres); }
}

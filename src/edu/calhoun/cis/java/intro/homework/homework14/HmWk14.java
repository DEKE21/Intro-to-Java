    package edu.calhoun.cis.java.intro.homework.homework14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

public class HmWk14 {
public static void main(String[] args) {
        List<Host> host = new ArrayList<Host>();
    readTalkshow(host);
    displayHosts(host);
    addHosts(host, "Meyers", "Seth", "0008", "12/28/1973");
    writeTalkshow(host);
}
public static void  readTalkshow(List<Host> lists){
FileInputStream fis = null;
BufferedReader bfr = null;
try {
String line;
File file = new File(System.getProperty("java.class.path") + System.getProperty("file.separator")+ "TALKSHOW.DAT");
SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
    
fis = new FileInputStream(file);
bfr = new BufferedReader(new InputStreamReader(fis));   
while((line = bfr.readLine()) != null){
     StringTokenizer tok = new StringTokenizer(line, " ");
    Host h = new Host();
    h.setFirstName(tok.nextToken());
    h.setLastName(tok.nextToken());
    h.setHostNumber(tok.nextToken());
    Date birtf = formatter.parse(tok.nextToken());
    h.setBirthday(birtf);
    lists.add(h);
}
}catch(Exception e){
    e.printStackTrace();
}finally{
    try{
        bfr.close();
    }catch(Exception e){
    
    }
}

}
public static void displayHosts(List<Host> list){
    for(Host d : list){
        System.out.println(d);
    }
}
public static void addHosts(List<Host> list , String fName , String lName, String hNumber, String bDayst){
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
    Date bDay = null;
    try{bDay = formatter.parse(bDayst);}
    catch(Exception e){}

    Host host = new Host(fName, lName, hNumber, bDay);
    list.add(host);

}
public static void writeTalkshow(List<Host> list ){
    FileOutputStream fos = null;
    BufferedWriter bw = null;

    try{
        File file = new File(System.getProperty("java.class.path") + System.getProperty("file.separator")+ "TALKSHOW_new.DAT");
        fos = new FileOutputStream(file);
        bw = new BufferedWriter( new OutputStreamWriter(fos));

        for(Host h : list){

            bw.write(h.getFirstName() + " " + h.getLastName()  +" " + h.getHostNumber() +" " + h.getBirthday() + System.getProperty("line.separator"));
            bw.flush();
        }
    }catch(Exception e ){
        e.printStackTrace();
    }finally{
        try{fos.close();}
        catch(Exception e){

        }
    }
}
}

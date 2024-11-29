    package edu.calhoun.cis.java.intro.homework.homework14;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.io.File;
import java.util.Date;

public class HmWk14 {
public static void main(String[] args) {
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
    List<Host> host = new ArrayList<Host>();
    readTalkshow(host);
    displayHosts(host);
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
}

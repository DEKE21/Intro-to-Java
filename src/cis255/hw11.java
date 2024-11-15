package cis255;

import java.util.LinkedHashMap;

import java.util.Map;

public class hw11 {
public static void main(String[] args) {
  Map<String, String> map = new LinkedHashMap<String, String>();
 map.put("M", "Mercedes");
map.put("B", "BMW");
 map.put("A", "Audi");
 map.remove("b");
 map.clear();
map.put("M", "Mitsubishi");
map.put("F", "Ford");
 map.remove("M");
 Map<String, String> fix = new LinkedHashMap<String, String>();
fix.put("Y", "Yugo");
fix.put("C", "Chevy");
map.putAll(fix);
  map.put("M", "Mercedes");
System.out.println(map);


 }   
public static void showListAnswer(String problem, Map<String,String> list) {
int itemCt = 0;
System.out.println(problem);
 
if (itemCt == 0){
    System.out.println("\tempty");

}
System.out.println();
}

}

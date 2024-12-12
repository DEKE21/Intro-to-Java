package cis255;

import java.util.LinkedHashMap;
import java.util.Map;

public class finexam {
public static void main(String[] args) {

    Map<String, String> map= new LinkedHashMap<String, String>();
    map.put("AL", "Alabama");
 map.put("NY", "New York");
  Map<String, String> fix1 =
new LinkedHashMap<String, String>();
fix1.put("HI", "Hawaii");
fix1.put("TN", "Tennessee");
map.putAll(fix1);
  map.remove("Al");
  map.clear();
  map.put("Tn", "Tennessee");
  map.remove("AK");
  map.put("AK", "Alaska");
 // Map<String, String> fix2 = null;
//fix2.put("AK", "Hawaii");
//fix2.put("TN", "Tennessee");
//map.putAll(fix2);

System.out.println(map);
/*
 a). AL=Alabama 
 b). AL=Alabama  NY=New York
c). AL=Alabama, NY=New York, HI=Hawaii, TN=Tennessee
d). AL=Alabama, NY=New York, HI=Hawaii, TN=Tennessee
e). empty
f). Tn=Tennessee
g). Tn=Tennessee
h). Tn=Tennessee  AK=Alaska
i).ERROR
 

  
 
 */
/*/
List<String> list = new LinkedList<String>();
list.add("Jim");

 list.add("Bill");
 list.add("Karen");
 //list.remove(3);
 list.add("Jim");
 list.add("Sam");
 list.remove("Jim");
 list.clear();
 // list.set(0, "Cindy");
List<String> fix =
new LinkedList<String>();
fix.add("Adam");
list.addAll(fix);
 list.add("Adam");

   System.out.println(list);
 a). Jim
   b). Jim, Bill
   c). Jim, Bill, Karen
   d). ERROR
   e). ERROR Jim, Bill, Karen, Jim
   f). ERROR Jim, Bill, Karen, Jim, Sam
   g). ERROR Bill, Karen, Jim, Sam
   h). ERROR  empty
   i). ERROR ERROR
   j). ERROR ERROR Adam
   k). ERRO ERROR Adam Adam


    
   */
}}

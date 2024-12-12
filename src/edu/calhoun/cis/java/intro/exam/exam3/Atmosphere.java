package edu.calhoun.cis.java.intro.exam.exam3;
public class Atmosphere {
private String id = null;
private String name = null;
private String startHeightInMiles = null;
private String endHeightInMiles = null;
public Atmosphere() {
}
public Atmosphere(String id, String name,
String startHeightInMiles, String endHeightInMiles) {
this.id = id;
this.name = name;
this.startHeightInMiles = startHeightInMiles;
this.endHeightInMiles = endHeightInMiles;
}
public String getId() {
return id;
}
public void setId(String id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getStartHeightInMiles() {
return startHeightInMiles;
}
public void setStartHeightInMiles(String startHeightInMiles) {
this.startHeightInMiles = startHeightInMiles;
}
public String getEndHeightInMiles() {
return endHeightInMiles;
}
public void setEndHeightInMiles(String endHeightInMiles) {
this.endHeightInMiles = endHeightInMiles;
}
@Override
public String toString() {
return "Atmosphere [id=" + id
+ ", name=" + name
+ ", startHeightInMiles=" + startHeightInMiles
+ ", endHeightInMiles=" + endHeightInMiles + "]";
}
}
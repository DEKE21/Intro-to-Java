package cis255;

public class Pilot extends Person {
  private String grade;
  private boolean isCurrent;
  private int numHours;
  public Pilot(){}
  public Pilot(String name, int age, String grade, boolean isCurrent, int numHours){
    super(name, age);
    this.grade = grade;
    this.isCurrent = isCurrent;
    this.numHours = numHours;
  }
     @Override
     public void play(){
        System.out.println("I cannot play! I am boarding the plane...");
     }
     @Override
     public void talk(){
        System.out.println("Redstone Traffic, Cessana Niner Seven Niner One Foxtrot taxiing to runway 35!");
     }
     public void takeoff(){
        System.out.println("Redstone Traffic, Cessana Niner Seven Niner One Foxtrot departing 35");
     }
     public void landing(){
        System.out.println("Redstone Traffic, Cessana Niner Seven Niner One Foxtrot final runway 17 full stop");
     }
    public void setGrade(String grde){
        this.grade = grde;
    }
    public String getGrade(){
        return(grade);
    }
    public void setCurrent(boolean current){
        this.isCurrent = current;
    }
    public boolean getCurrent(){
        return(isCurrent);
    }
    public void setHours(int hours){
        this.numHours = hours;
    }
    public int getHours(){
        return(numHours);
    }
    @Override
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("\nName: " + name);
        buffer.append("\nAge: " +age);
        buffer.append("\nGrade: " + grade);
        buffer.append("\nCurrent? " + isCurrent);
        buffer.append("\nHour: "+ numHours);
        return(buffer.toString());
    }
}
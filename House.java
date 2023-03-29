/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors,boolean hasDiningRoom ) {
    super(name, address, nFloors);
    this.residents= new ArrayList<String>();
    this.hasDiningRoom= hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  public String toString(){
    String description= super.toString();
    description += ". This house has " + this.residents.size() +" residents.";
    description += " This house";
    if (this.hasDiningRoom){
      description+= "has";
    }else{
      description += "does not have";
    }
    description += " a dining room";

    return description;
  }

  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  public int nResidents(){
    return this.residents.size();
  }

  public void moveIn(String name){
    if (this.residents.contains(name)){
      throw new RuntimeException("The resident "+ name + " already resides in the house.");
    }else{
    this.residents.add(name);
  }
}
  public String moveOut(String name){
    if (this.residents.contains(name)){
      this.residents.remove(name);
      return name;
    }else{
      throw new RuntimeException("The resident "+ name + " does not live in the house.");
    }
  } 

  public boolean isResident(String person){
    if (this.residents.contains(person)){
      System.out.println(person + "is a resident.");
      return true;
    }else{
      System.out.println(person +" is not a resident.");
      return false;
    }
  }

  public static void main(String[] args) {
    House Chase= new House("Chase", "1 chapin way", 3, false);
    System.out.println(Chase);
    Chase.moveIn("emma");
    Chase.moveIn("emma");
    System.out.println(Chase);
    Chase.moveOut("emma");
    System.out.println(Chase);
    Chase.isResident("ava");
    
  }
}
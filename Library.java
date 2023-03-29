/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building {
  private Hashtable <String, Boolean> collection;
    
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection= new Hashtable<String, Boolean>();

    System.out.println("You have built a library: 📖");
    }
    
    public void addTitle(String title){
      if (this.collection.containsKey(title)){
        throw new RuntimeException("The book "+ title + " already exists in this Library.");
      }else{
      this.collection.put(title, true);
    }
  }

    public String removeTitle(String title){
      if (this.collection.containsKey(title)){
        this.collection.remove(title);
        return (title);        
      }else{
        throw new RuntimeException("The book "+ title + " does not exist in this Library.");
    }
  }

    public void checkOut(String title){
      System.out.println("you have checked out "+ title);
      this.collection.replace(title, false);
    }

    public void returnBook(String title){
      System.out.println("you have returned "+ title);
      this.collection.replace(title, true);
    }

    public boolean containsTitle(String title){
      if (this.collection.containsKey(title)){
        return true;
    
      }else{
        return false;
      }
    }

    public boolean isAvailable(String title ){
      if (this.collection.containsKey(title) && this.collection.get(title).equals(true)){
        
        System.out.println("Yes! " + title +" is availble");
        return this.collection.get(title);
        
      }else{
        throw new RuntimeException("Sorry "+ title+ " is unavailble, it is currently checked out or not owned by this library.");
      }
    }

    public void printCollection(){
      this.collection.forEach((title, avail)-> System.out.println("availible: "+ avail + "  title: " + title));}
    
  
    public static void main(String[] args) {
      Library Hillyer= new Library("Hillyer","3 chapinn way", 4);
      Hillyer.addTitle("loraz");
      Hillyer.addTitle("barbie");
      Hillyer.printCollection();
      Hillyer.isAvailable("barbie");
      Hillyer.checkOut("barbie");
      Hillyer.printCollection();
      //Hillyer.removeTitle("hi");
      Hillyer.isAvailable("hi");


    }
  
  }
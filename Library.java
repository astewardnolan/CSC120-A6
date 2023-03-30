/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building {
  private Hashtable <String, Boolean> collection;
  /**
   * creates library constructor
   * @param name name of library
   * @param address address of library
   * @param nFloors number of floors in library
   */ 
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection= new Hashtable<String, Boolean>();

    System.out.println("You have built a library: 📖");
    }
   /**
    * add book to the library
    * @param title title of the book
    */ 
    public void addTitle(String title){
      if (this.collection.containsKey(title)){
        throw new RuntimeException("The book "+ title + " already exists in this Library.");
      }else{
      this.collection.put(title, true);
    }
  }
    /**
     * removes title from the library
     * @param title title of the book
     * @return returns itile
     */
    public String removeTitle(String title){
      if (this.collection.containsKey(title)){
        this.collection.remove(title);
        return (title);        
      }else{
        throw new RuntimeException("The book "+ title + " does not exist in this Library.");
    }
  }
    /**
     * changes boolean from true to false, checking out a book
     * @param title title of the book
     */
    public void checkOut(String title){
      System.out.println("you have checked out "+ title);
      this.collection.replace(title, false);
    }
/**
 * changes boolean from false to true, returning a book
 * @param title title of book
 */
    public void returnBook(String title){
      System.out.println("you have returned "+ title);
      this.collection.replace(title, true);
    }
/**
 * checks to see if book title is in collection
 * @param title title of book
 * @return true or flase based on if book is in collection
 */
    public boolean containsTitle(String title){
      if (this.collection.containsKey(title)){
        return true;
    
      }else{
        return false;
      }
    }
/**
 * checks if boolean value is true making book availbe
 * @param title title of book
 * @return title of book
 */
    public boolean isAvailable(String title ){
      if (this.collection.containsKey(title) && this.collection.get(title).equals(true)){
        
        System.out.println("Yes! " + title +" is availble");
        return this.collection.get(title);
        
      }else{
        throw new RuntimeException("Sorry "+ title+ " is unavailble, it is currently checked out or not owned by this library.");
      }
    }
/**
 * prints out collection of book titles and if availbe or not.
 */
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
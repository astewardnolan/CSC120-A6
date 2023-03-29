/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors); 
        
        this.nCoffeeOunces= nCoffeeOunces;
        this.nSugarPackets= nSugarPackets;
        this.nCreams= nCreams;
        this.nCups=nCups;

        System.out.println("You have built a cafe: ☕");
    }
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        while (this.nCoffeeOunces< size || this.nSugarPackets < nSugarPackets || this.nCreams < nCreams){
            this.restock(100,100,100,500);
            System.out.println("We have to restock our supplies to make your order, just a moment!");
        }
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        System.out.println("You have bought a "+ size+" ounce coffee with " + nSugarPackets+ " sugar packets and "+ nCreams +" creams!");
        }
    
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups; 
    }
    public static void main(String[] args) {
        Cafe Dunkin = new Cafe("dunkin", "5 chapin way", 3, 24, 50, 4, 20);
        Dunkin.sellCoffee(4, 1, 300);
    }
    
}

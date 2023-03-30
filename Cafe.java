/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
/**
 * creates cafe constructor
 * @param name of cafe
 * @param address of cafe
 * @param nFloors of cafe
 * @param nCoffeeOunces in coffee drink
 * @param nSugarPackets in coffee drink
 * @param nCreams in coffee drink
 * @param nCups in coffee drink
 */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors); 
        
        this.nCoffeeOunces= nCoffeeOunces;
        this.nSugarPackets= nSugarPackets;
        this.nCreams= nCreams;
        this.nCups=nCups;

        System.out.println("You have built a cafe: ☕");
    }
    /**
     * sells coffeee, lowering inventory and restocking if needed
     * @param size of coffe
     * @param nSugarPackets in coffee
     * @param nCreams in coffee
     */
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
    /**
     * restockes inventory by adding to paramenters
     * @param nCoffeeOunces ounces of coffee
     * @param nSugarPackets sugar packets
     * @param nCreams creams
     * @param nCups cups of coffee
     */
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

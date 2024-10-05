// Subclass for the donut toppings
public class Topping extends Donut {
    private String frostingFlavor;
    private String filling;
    private boolean hasSprinkles;

  /*
    no-argument, parameterized constructors for the toppings of the donut
    and Accessor and Mutator methods for the toppings of the donut
  */
    
    // No-argument constructor
    public Topping() {
        super(); // Calls the no-argument constructor of Donut
        this.frostingFlavor = "No Frosting";
        this.filling = "No Filling";
        this.hasSprinkles = false;
    }
    
    // Parameterized constructor
    public Topping(String type, double price, String frostingFlavor, String filling, boolean hasSprinkles) {
        super(type, price); // Calls the parameterized constructor of Donut
        this.frostingFlavor = frostingFlavor;
        this.filling = filling;
        this.hasSprinkles = hasSprinkles;
    }

    // Accessor methods
    public String getFrostingFlavor() {
        return frostingFlavor;
    }

    public String getFilling() {
        return filling;
    }

    public boolean getHasSprinkles() {
        return hasSprinkles;
    }

    // Mutator methods
    public void setFrostingFlavor(String frostingFlavor) {
        this.frostingFlavor = frostingFlavor;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }
}
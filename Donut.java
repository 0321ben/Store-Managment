// Superclass for donut
public class Donut {
    private String type; // e.g., glazed, plain, etc.
    private double price;

  /*
    no-argument, parameterized constructors for the donut
    and Accessor, Mutator, and toString methods for the donut
  */
    // No-argument constructor
    public Donut() {
        this.type = "Plain Donut";
        this.price = 2.50;
    }
    
    // Parameterized constructor
    public Donut(String type, double price) {
        this.type = type;
        this.price = price;
    }
    
    // Accessor methods
    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
    
    // Mutator methods
    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method
    @Override
    public String toString() {
        return "Donut Type: " + type + ", Price: $" + price;
    }
}

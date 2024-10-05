// Subclass for the coffee
public class Coffee {
    private boolean isDecaf;
    private int creamer;
    private int sugar;
    private int halfAndHalf;

  /*
    no-argument and parameterized constructors for the coffee and its condiments
    and Accessor, Mutator, and toString methods for the coffee and its condiments
  */
    
    // No-argument constructor 
    public Coffee() {
        this.isDecaf = false;
        this.creamer = 0;
        this.sugar = 0;
        this.halfAndHalf = 0;
    }
    
    // Parameterized constructor
    public Coffee(boolean isDecaf, int creamer, int sugar, int halfAndHalf) {
        this.isDecaf = isDecaf;
        this.creamer = creamer;
        this.sugar = sugar;
        this.halfAndHalf = halfAndHalf;
    }

    // Accessor methods
    public boolean isDecaf() {
        return isDecaf;
    }

    public int getCreamer() {
        return creamer;
    }

    public int getSugar() {
        return sugar;
    }

    public int getHalfAndHalf() {
        return halfAndHalf;
    }

    // Mutator methods
    public void setDecaf(boolean isDecaf) {
        this.isDecaf = isDecaf;
    }

    public void setCreamer(int creamer) {
        this.creamer = creamer;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setHalfAndHalf(int halfAndHalf) {
        this.halfAndHalf = halfAndHalf;
    }

    // toString method
    @Override
    public String toString() {
        return "Coffee: Decaf: " + isDecaf + ", Creamer: " + creamer + ", Sugar: " + sugar + ", Half and Half: " + halfAndHalf;
    }
}


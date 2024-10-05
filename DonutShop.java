import java.util.Scanner;

public class DonutShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      /*
        All of this file is for the conversation 
        that happens in the console
      */

        // conversation on donuts
        System.out.println("Welcome to the Donut Shop!");
        
        // type of donut
        System.out.print("What type of donut would you like (e.g., glazed, chocolate, plain)? ");
        String donutType = scanner.nextLine();
        
        // price of donut
        double donutPrice = 2.50;

        System.out.print("What frosting flavor would you like (or type 'none')? ");
        String frosting = scanner.nextLine();
        
        System.out.print("What type of filling would you like (or type 'none')? ");
        String filling = scanner.nextLine();
        
        System.out.print("Would you like sprinkles (yes/no)? ");
        String sprinklesResponse = scanner.nextLine();
        boolean hasSprinkles = sprinklesResponse.equalsIgnoreCase("yes");
        
        // the toppings
        Topping donutOrder = new Topping(donutType, donutPrice, frosting, filling, hasSprinkles);
        
        // the donut order
        System.out.println("\nYour donut order:");
        System.out.println(donutOrder);

        // asking if want coffee
        System.out.print("\nWould you like coffee (yes/no)? ");
        String coffeeResponse = scanner.nextLine();
        
        if (coffeeResponse.equalsIgnoreCase("yes")) {
            // decaf
            System.out.print("Do you want decaf (yes/no)? ");
            boolean isDecaf = scanner.nextLine().equalsIgnoreCase("yes");
            
            // asking about coffee toppings
            System.out.print("How many creamers would you like? ");
            int creamer = scanner.nextInt();
            
            System.out.print("How many sugars would you like? ");
            int sugar = scanner.nextInt();
            
            System.out.print("How many half and half? ");
            int halfAndHalf = scanner.nextInt();
            
            // coffee toppings
            Coffee coffeeOrder = new Coffee(isDecaf, creamer, sugar, halfAndHalf);
            
            // the coffee order
            System.out.println("\nYour coffee order  (It's free :D ):");
            System.out.println(coffeeOrder);
        }
    }
}
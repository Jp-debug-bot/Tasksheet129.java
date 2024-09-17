// Define the Animal interface
interface Animal {
    // Method to feed the animal
    boolean feed(boolean timeToEat);
    
    // Method to groom the animal
    void groom();
    
    // Method to pet the animal
    void pet();
}

// Gorilla class that implements the Animal interface
class Gorilla implements Animal {

    // Implement the feed method
    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("Gorilla is eating. Food has been placed into the cage.");
            return true;
        } else {
            System.out.println("It's not time to eat yet.");
            return false;
        }
    }

    // Implement the groom method
    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Gorilla is being groomed. Lather, rinse, repeat.");
    }

    // Implement the pet method
    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("You are petting the gorilla. Pet at your own risk!");
    }
}

// Main class to test the Gorilla class
public class Main {
    public static void main(String[] args) {
        // Create an instance of Gorilla
        Gorilla gorilla = new Gorilla();
        
        // Feed the gorilla
        gorilla.feed(true);
        
        // Groom the gorilla
        gorilla.groom();
        
        // Pet the gorilla
        gorilla.pet();
    }
}

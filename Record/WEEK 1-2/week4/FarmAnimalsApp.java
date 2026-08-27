 class FarmAnimal {
    String name;
    String sound;

    // Constructor
    FarmAnimal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    // Method
    void display() {
        System.out.println("Animal: " + name);
        System.out.println("Sound : " + sound);
        System.out.println();
    }
}

public class FarmAnimalsApp {
    public static void main(String[] args) {

        // Creating objects
        FarmAnimal cow = new FarmAnimal("Cow", "Moo");
        FarmAnimal dog = new FarmAnimal("Dog", "Bark");
        FarmAnimal cat = new FarmAnimal("Cat", "Meow");
        FarmAnimal hen = new FarmAnimal("Hen", "Cluck");

        // Displaying details
        System.out.println("FARM ANIMALS APP ");

        cow.display();
        dog.display();
        cat.display();
        hen.display();
    }
} 
    


package Records;


    class Sample {

    String name;
    String stay;
    String food;
    String sound;

    // Constructor
    Sample(String name, String stay, String food, String sound) {
        this.name = name;
        this.stay = stay;
        this.food = food;
        this.sound = sound;
    }

    // Method
    void displayDetails() {
        System.out.println("Animal Name : " + name);
        System.out.println("Stays       : " + stay);
        System.out.println("Eats        : " + food);
        System.out.println("Sound       : " + sound);
    }
}
    public class FarmAnimal{

    public static void main(String[] args) {

        Sample cow = new Sample("Cow", "Cowshed", "Grass", "Moo" );

        Sample pig = new Sample( "Pig", "Pigsty", "Vegetables", "Oink" );

        Sample horse = new Sample("Horse", "Stable", "Grass", "Neigh");

        cow.displayDetails();
        pig.displayDetails();
        horse.displayDetails();
    }
}


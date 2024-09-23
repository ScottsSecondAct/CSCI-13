package type_casting;

public class TypeCastingExample {
    public static void main(String[] args) {
        Animal animal = new Cat();  // Upcasting
        animal.makeSound();

        // Downcasting
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.purr();  // Now we can access methods specific to Cat
        }
    }
}

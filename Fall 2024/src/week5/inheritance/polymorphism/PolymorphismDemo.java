package week5.inheritance.polymorphism;
// Superclass Animal
class Animal {
  // Method that will be overridden
  public void sound() {
    System.out.println("This animal makes a sound.");
  }
}

// Subclass Dog that overrides sound method
class Dog extends Animal {
  @Override
  public void sound() {
    System.out.println("The dog barks.");
  }
}

// Subclass Cat that overrides sound method
class Cat extends Animal {
  @Override
  public void sound() {
    System.out.println("The cat meows.");
  }
}

// Subclass Cow that overrides sound method
class Cow extends Animal {
  @Override
  public void sound() {
    System.out.println("The cow moos.");
  }
}

// Main class
public class PolymorphismDemo {
  public static void main(String[] args) {
    // Create objects of Animal type but instantiate them with different subclasses
    Animal myDog = new Dog();
    Animal myCat = new Cat();
    Animal myCow = new Cow();

    // Call the overridden method for each object
    myDog.sound(); // Outputs: The dog barks.
    myCat.sound(); // Outputs: The cat meows.
    myCow.sound(); // Outputs: The cow moos.
  }
}

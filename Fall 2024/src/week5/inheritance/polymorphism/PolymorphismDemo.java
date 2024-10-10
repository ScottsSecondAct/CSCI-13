/**
 * MIT License
 *
 * Copyright (c) 2024 Scott Davis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
 
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

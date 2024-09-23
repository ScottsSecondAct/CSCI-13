package week5.inheritance.super_command;
public class SubClass extends SuperClass {
  public SubClass() {
    super("Hello from SuperClass"); // Must call the superclass constructor
    System.out.println("Subclass constructor");
  }
}

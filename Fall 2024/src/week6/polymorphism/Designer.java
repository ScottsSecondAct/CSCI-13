package polymorphism;

public class Designer extends Employee {
  @Override
  void work() {
    System.out.println("Designing interfaces.");
  }

  void design() {
    System.out.println("Designing.");
  }
}

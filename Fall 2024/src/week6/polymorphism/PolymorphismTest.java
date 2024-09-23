package polymorphism;

public class PolymorphismTest {
  public static void main(String[] args) {
    Employee e1 = new Developer(); // Polymorphism
    Employee e2 = new Designer();

    e1.work(); // Calls Developer's work()
    e2.work(); // Calls Designer's work()

    Employee[] employees = { new Developer(), new Designer() };
    for (Employee employee : employees) {
      employee.work();
    }
  }
}
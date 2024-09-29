package Package2;


import Package1.SuperClass;

public class SubClass extends SuperClass {
  public SubClass(int value) {
    super(value);
  }

  public void incrementValue() {
    value++;
  }

  public static void main(String[] args) {
    SubClass sub = new SubClass(10);
    sub.printValue(); // Accesses the protected method from SuperClass
    sub.incrementValue();
    sub.printValue();
  }
}

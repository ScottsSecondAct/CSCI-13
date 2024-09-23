package object_class_and_methods;

public class ObjectClassTest 
 {
  public static void main(String[] args) {
    Person p1 = new Person("John");
    Person p2 = new Person("John");
    Person p3 = new Person("Jane");

    System.out.println(p1.equals(p2)); // true
    System.out.println(p1.equals(p3)); // false

    System.out.println(p1.toString()); // Person[name=John]
  }
}

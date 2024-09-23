package object_class_and_methods;

public class Person {
  String name;

  Person(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Person person = (Person) obj;
    return name.equals(person.name);
  }

  @Override
  public String toString() {
    return "Person[name=" + name + "]";
  }
}

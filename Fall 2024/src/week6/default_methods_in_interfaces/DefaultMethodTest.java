package default_methods_in_interfaces;

public class DefaultMethodTest {
  public static void main(String[] args) {
    Human human = new Human();
    human.walk(); // Uses default walk() method from CanWalk interface
  }
}

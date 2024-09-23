package is_a_relationship;

public class IsARelationshipTest {
  public static void main(String[] args) {
    Sparrow sparrow = new Sparrow();
    sparrow.fly(); // Is-a relationship: Sparrow is a Bird
    sparrow.chirp();
  }
}
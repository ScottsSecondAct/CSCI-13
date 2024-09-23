package default_methods_in_interfaces;

public interface CanWalk {
    default void walk() {
        System.out.println("Walking...");
    }
}

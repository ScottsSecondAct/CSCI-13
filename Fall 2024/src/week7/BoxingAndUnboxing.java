

public class BoxingAndUnboxing {
  public static void main(String[] args) {

    // Autoboxing and Unboxing
    int num = 10;
    Integer wrappedNum = num; // Auto-Boxing

    // Unboxing: Converting a wrapper class to a primitive type
    int unwrappedNum = wrappedNum; // Auto-Unboxing

    System.out.println("Original number: " + num);
    System.out.println("Auto Wrapped number: " + wrappedNum);
    System.out.println("Auto Unwrapped number: " + unwrappedNum);

    // Manual Boxing and Unboxing
    Integer manualWrappedNum = Integer.valueOf(num); // Manual-boxing
    int manualUnwrappedNum = manualWrappedNum.intValue(); // Manual-unboxing

    System.out.println("Original number: " + num);
    System.out.println("Manually wrapped number: " + manualWrappedNum);
    System.out.println("Manually unwrapped number: " + manualUnwrappedNum);
  }
}
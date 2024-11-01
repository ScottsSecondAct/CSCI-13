package Debugging.Example2;
public class CallStackExample {
    public static void main(String[] args) {
        System.out.println("In main method");
        methodA();
        System.out.println("Back in main method");
    }

    public static void methodA() {
        System.out.println("In methodA");
        methodB();
        System.out.println("Back in methodA");
    }

    public static void methodB() {
        System.out.println("In methodB");
        methodC();
        System.out.println("Back in methodB");
    }

    public static void methodC() {
        System.out.println("In methodC");
        String str = null;  // Bug: str is not initialized
        System.out.println(str.length());  // NullPointerException occurs here
        System.out.println("Back in methodC");
    }
}

public class ClassCastExample {
    public static void main(String[] args) {
        Object obj = new String("Hello");
        Integer num = (Integer) obj;  // ClassCastException
    }
}


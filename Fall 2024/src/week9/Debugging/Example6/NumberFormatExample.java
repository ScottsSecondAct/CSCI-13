public class NumberFormatExample {
    public static void main(String[] args) {
        String number = "123abc";
        int num = Integer.parseInt(number);  // NumberFormatException
    }
}

package main.java.com.s1scottd.Printf;
public class SalesReport {
  public static void main(String[] args) {
    // Sample sales data
    String[][] salesData = {
        { "John Doe", "45", "1245.50", "5.5" },
        { "Jane Smith", "120", "21500.75", "8.0" },
        { "Bill Turner", "3", "45.00", "-2.5" },
    };

    // Print the report header
    System.out.println("-----------------------------------------------");
    System.out.printf("%-15s %5s %7s %17s%n", "Name", "Units", "Sales", "Commission");
    System.out.println("-----------------------------------------------");

    // Iterate over each sales record and print formatted output
    for (String[] sales : salesData) {
      String name = sales[0];
      int units = Integer.parseInt(sales[1]);
      double salesAmount = Double.parseDouble(sales[2]);
      double commission = Double.parseDouble(sales[3]);

      // Print the formatted sales data using printf
      System.out.printf("%-15s %05d %10.2f %8.2f%%%n", name, units, salesAmount, commission);
    }
  }
}

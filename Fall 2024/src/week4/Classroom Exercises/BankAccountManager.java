/**
 * MIT License
 *
 * Copyright (c) 2024 Scott Davis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
 
import java.util.Scanner;

class BankAccount {
  private String accountHolderName;
  private String accountNumber;
  private double balance;

  public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
    this.accountHolderName = accountHolderName;
    this.accountNumber = accountNumber;
    this.balance = initialBalance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposit successful. Current balance: " + balance);
    } else {
      System.out.println("Deposit amount must be positive.");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawal successful. Current balance: " + balance);
    } else if (amount > balance) {
      System.out.println("Insufficient funds. Current balance: " + balance);
    } else {
      System.out.println("Withdrawal amount must be positive.");
    }
  }

  public void checkBalance() {
    System.out.println("Account balance: " + balance);
  }

  @Override
  public String toString() {
    return "Account Holder: " + accountHolderName + "\nAccount Number: " + accountNumber + "\nBalance: " + balance;
  }
}

public class BankAccountManager {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BankAccount account = null;
    boolean running = true;

    while (running) {
      System.out.println("\nBank Account Manager:");
      System.out.println("1. Create a bank account");
      System.out.println("2. Deposit money");
      System.out.println("3. Withdraw money");
      System.out.println("4. Check balance");
      System.out.println("5. Exit");
      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();
      scanner.nextLine(); // Consume newline

      switch (choice) {
        case 1:
          System.out.print("Enter account holder name: ");
          String name = scanner.nextLine();
          System.out.print("Enter account number: ");
          String accountNumber = scanner.nextLine();
          System.out.print("Enter initial balance: ");
          double initialBalance = scanner.nextDouble();
          account = new BankAccount(name, accountNumber, initialBalance);
          System.out.println("Account created successfully.");
          System.out.println(account);
          break;
        case 2:
          if (account != null) {
            System.out.print("Enter deposit amount: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);
          } else {
            System.out.println("No account found. Please create an account first.");
          }
          break;
        case 3:
          if (account != null) {
            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();
            account.withdraw(withdrawalAmount);
          } else {
            System.out.println("No account found. Please create an account first.");
          }
          break;
        case 4:
          if (account != null) {
            account.checkBalance();
          } else {
            System.out.println("No account found. Please create an account first.");
          }
          break;
        case 5:
          running = false;
          System.out.println("Exiting Bank Account Manager.");
          break;
        default:
          System.out.println("Invalid choice.");
      }
    }
    scanner.close();
  }
}

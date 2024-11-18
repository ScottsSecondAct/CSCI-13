// Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
  public InsufficientBalanceException(String message) {
    super(message);
  }
}

// Bank Account Class
class BankAccount {
  private String accountNumber;
  private double balance;

  public BankAccount(String accountNumber, double initialBalance) {
    this.accountNumber = accountNumber;
    this.balance = initialBalance;
  }

  // Method to deposit money
  public void deposit(double amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("Amount to deposit cannot be negative.");
    }
    balance += amount;
    System.out.println("Successfully deposited: $" + amount);
  }

  // Method to withdraw money
  public void withdraw(double amount) throws InsufficientBalanceException {
    if (amount < 0) {
      throw new IllegalArgumentException("Amount to withdraw cannot be negative.");
    }
    if (amount > balance) {
      throw new InsufficientBalanceException("Insufficient balance. Your balance is: $" + balance);
    }
    balance -= amount;
    System.out.println("Successfully withdrew: $" + amount);
  }

  // Method to check balance
  public double checkBalance() {
    return balance;
  }

  // Method to transfer money to another account
  public void transfer(BankAccount recipient, double amount) throws InsufficientBalanceException {
    System.out.println("Transferring $" + amount + " to account: " + recipient.accountNumber);
    this.withdraw(amount); // Withdraw from sender's account
    recipient.deposit(amount); // Deposit to recipient's account
    System.out.println("Transfer successful.");
  }
}

// Main Class
public class ExceptionDemo {
  public static void main(String[] args) {
    try {
      // Create bank accounts
      BankAccount account1 = new BankAccount("12345", 1000.0);
      BankAccount account2 = new BankAccount("67890", 500.0);

      // Perform operations
      account1.deposit(200);
      account1.withdraw(500);
      account1.transfer(account2, 300);
      System.out.println("Account 1 Balance: $" + account1.checkBalance());
      System.out.println("Account 2 Balance: $" + account2.checkBalance());

      // Trigger an exception by withdrawing too much
      account1.withdraw(2000);

    } catch (IllegalArgumentException e) {
      System.err.println("Invalid operation: " + e.getMessage());
    } catch (InsufficientBalanceException e) {
      System.err.println("Error: " + e.getMessage());
    } finally {
      System.out.println("Thank you for using our banking system.");
    }
  }
}

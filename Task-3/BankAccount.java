package Task3;

public class BankAccount {
	 private double balance;

	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: Rs" + amount);
	        } else {
	            System.out.println("Invalid deposit amount");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawn: Rs" + amount);
	        } else {
	            System.out.println("Invalid withdrawal or insufficient funds");
	        }
	    }

	    public double checkBalance() {
	        System.out.println("Current Balance: Rs" + balance);
	        return balance;
	    }

}

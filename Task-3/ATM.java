package Task3;

public class ATM {
	
	private  BankAccount userAccount;

	    public ATM(BankAccount userAccount) {
	        this.userAccount = userAccount;
	    }

	    public void deposit(double amount) {
	        userAccount.deposit(amount);
	    }

	    public void withdraw(double amount) {
	        userAccount.withdraw(amount);
	    }

	    public double checkBalance() {
	        return userAccount.checkBalance();
	    }

	    public void displayMenu() {
	        System.out.println("\nChoose an operation:");
	        System.out.println("1. Deposit");
	        System.out.println("2. Withdraw");
	        System.out.println("3. Check Balance");
	        System.out.println("4. Exit");
	        
	    }
	    

}

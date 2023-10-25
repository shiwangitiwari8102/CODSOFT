package Task3;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter initial balance: Rs");
	        double initialBalance = scanner.nextDouble();

	        BankAccount userAccount = new BankAccount(initialBalance);
	        ATM atm = new ATM(userAccount);

	        while (true) {
	            atm.displayMenu();
	            int choice = scanner.nextInt();

	            switch (choice){
	                case 1:
	                    System.out.print("Enter deposit amount: Rs");
	                    double depositAmount = scanner.nextDouble();
	                    atm.deposit(depositAmount);
	                    break;

	                case 2:
	                    System.out.print("Enter withdrawal amount: Rs");
	                    double withdrawalAmount = scanner.nextDouble();
	                    atm.withdraw(withdrawalAmount);
	                    break;

	                case 3:
	                    atm.checkBalance();
	                    break;
	                
	                case 4:
	                    System.out.println("Exiting ATM. Thank you!");
	                    return;

	                default:
	                    System.out.println("Invalid choice. Please choose again.");
	                    break;
	            }

	            System.out.println("Do you want to perform another operation? (yes/no)");
	            String operation = scanner.next().toLowerCase();
	            if (!operation.equals("yes")) {
	                System.out.println("Thank you for using our ATM services. Have a great day!");
	                break;
	            }
	        }

	        scanner.close(); 
	    }

	}



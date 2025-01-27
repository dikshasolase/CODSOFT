package javacorner;
import java.util.Scanner;

public class ATMInterface {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ch = 0,balance = 0;;

        while (ch!=4) 
        {
            System.out.println("\nATM Interface Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option(1-4): ");
            ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    System.out.printf("Current Balance: %d\n", balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    if (depositAmount > 0) {
                        balance= depositAmount+balance;
                        System.out.printf("Deposited: %d\n", depositAmount);
                    } 
                    else 
                    {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = (int) scanner.nextInt();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance= withdrawAmount-balance;
                        System.out.printf("Withdrawn: %d\n", withdrawAmount);
                    } 
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();

	}

}


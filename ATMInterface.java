import java.util.Scanner;

public class ATMInterface {
    private double accountBalance;

    public ATMInterface(double initialBalance) {
        this.accountBalance = initialBalance;
    }

    public void displayMenu() {
        System.out.println("ATM Interface");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Deposit Cash");
        System.out.println("4. Exit");
    }

    public void checkBalance() {
        System.out.println("Your account balance is: " + accountBalance);
    }

    public void withdrawCash(double amount) {
        if (amount > accountBalance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            accountBalance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
            System.out.println("Updated account balance: " + accountBalance);
        }
    }

    public void depositCash(double amount) {
        accountBalance += amount;
        System.out.println("Successfully deposited: " + amount);
        System.out.println("Updated account balance: " + accountBalance);
    }

    public static void main(String[] args) {
        ATMInterface atm = new ATMInterface(1000.0); // Initial account balance
        Scanner scanner = new Scanner(System.in);

        while (true) {
            atm.displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdrawCash(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.depositCash(depositAmount);
                    break;
                case 4:
                    System.out.println("Exiting. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

import java.util.Scanner;

// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Main {

    static double balance = 5000;

    // Method using throws
    static void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            // Explicitly throwing exception
            throw new InsufficientBalanceException(
                    "Insufficient Balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal Successful");
        System.out.println("Available Balance: ₹" + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                        System.out.println("Current Balance: " + balance);
                        break;

                    case 2:
                        System.out.print("Enter Amount: ");
                        double amount =
                                Double.parseDouble(sc.nextLine());

                        try {
                            withdraw(amount);
                        } catch (InsufficientBalanceException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 3:
                        System.out.println("Thank You!");
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter valid numbers only.");
            }
        }
    }
}
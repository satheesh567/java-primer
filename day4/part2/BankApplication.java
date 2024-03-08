import java.util.Random;

public class BankAccount {

    private static int lastAccountNumber = 1000; 
    private String name;
    private String address;
    private String type;
    private double balance;
    private int numTransactions;

    public BankAccount(String name, String address, String type, double balance) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.balance = balance;
        this.numTransactions = 0;
        lastAccountNumber++; 
    }

    public String generateAccountNumber() {
        return "BA" + lastAccountNumber;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + generateAccountNumber());
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Type: " + type);
        System.out.println("Balance: Rs." + balance);
        System.out.println("Number of Transactions: " + numTransactions);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            numTransactions++;
            System.out.println("Rs." + amount + " deposited successfully!");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            numTransactions++;
            System.out.println("Rs." + amount + " withdrawn successfully!");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount!");
        }
    }

    public void changeAddress(String newAddress) {
        address = newAddress;
        numTransactions++;
        System.out.println("Address changed successfully!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of depositors: ");
        int numDepositors = scanner.nextInt();

        BankAccount[] accounts = new BankAccount[numDepositors];
        for (int i = 0; i < numDepositors; i++) {
            System.out.println("\nEnter details for depositor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Address: ");
            String address = scanner.next();
            System.out.print("Type of Account: ");
            String type = scanner.next();
            System.out.print("Balance: ");
            double balance = scanner.nextDouble();

            accounts[i] = new BankAccount(name, address, type, balance);
        }

        int choice, accountIndex;
        double amount;
        String newAddress;
        Random random = new Random();

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Print information of a depositor");
            System.out.println("2. Deposit money to an account");
            System.out.println("3. Withdraw money from an account");
            System.out.println("4. Change address of a depositor");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account index (1-" + numDepositors + "): ");
                    accountIndex = scanner.nextInt() - 1;
                    if (accountIndex >= 0 && accountIndex < numDepositors) {
                        accounts[accountIndex].displayInfo();
                    } else {
                        System.out.println("Invalid account index!");
                    }
                    break;
                case 2:
                    System.out.print("Enter account index (1-" + numDepositors + "): ");
                    accountIndex = scanner.nextInt() - 1;
                    if (accountIndex >= 0 && accountIndex < numDepositors) {
                        System.out.print("Enter amount to deposit: ");
                        amount = scanner.nextDouble();
                        accounts[accountIndex].deposit(amount);
                    }
                    else {
                        System.out.println("Invalid account index!");
                    }
                    break;
                case 3:
                    System.out.print("Enter account index (1-" + numDepositors + "): ");
                    accountIndex = scanner.nextInt() - 1;
                    if (accountIndex >= 0 && accountIndex < numDepositors) {
                        System.out.print("Enter amount to withdraw: ");
                        amount = scanner.nextDouble();
                        accounts[accountIndex].withdraw(amount);
                    } else {
                        System.out.println("Invalid account index!");
                    }
                    break;
                case 4:
                    System.out.print("Enter account index (1-" + numDepositors + "): ");
                    accountIndex = scanner.nextInt() - 1;
                    if (accountIndex >= 0 && accountIndex < numDepositors) {
                        System.out.print("Enter new address: ");
                        scanner.nextLine(); // Consume newline character
                        newAddress = scanner.nextLine();
                        accounts[accountIndex].changeAddress(newAddress);
                    } else {
                        System.out.println("Invalid account index!");
                    }
                    break;
                case 5:
                    int totalTransactions = 0;
                    for (BankAccount account : accounts) {
                        totalTransactions += account.numTransactions;
                    }
                    System.out.println("Total number of transactions: " + totalTransactions);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }
}

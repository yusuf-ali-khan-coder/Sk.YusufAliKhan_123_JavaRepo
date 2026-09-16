class Account {
    int accountNumber;
    double balance;
    String accountType;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance = balance + interest;
        System.out.println("Interest added: " + interest);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}

class jpp1 {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();

        s.accountNumber = 101;
        s.accountType = "Savings";
        s.balance = 5000;
        s.interestRate = 5;

        s.deposit(2000);
        s.withdraw(1000);
        s.calculateInterest();

        s.display();

        System.out.println();

        CurrentAccount c = new CurrentAccount();

        c.accountNumber = 102;
        c.accountType = "Current";
        c.balance = 3000;
        c.overdraftLimit = 2000;

        c.deposit(1000);
        c.withdraw(5000);

        c.display();
    }
}
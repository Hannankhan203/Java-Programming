public class BankAccount {
    private String accountHolderName;
    private double balance;
    private double interestRate;

    public BankAccount(String acccountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.interestRate = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposited amount must be positive");
        }
    }

    public void withdraw(double amount){
        if(amount < 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else if(amount > balance){
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive");
        }
    }

    public void setInterestRate(double rate){
        if(rate >= 0){
            interestRate = rate;
            System.out.println("Interest rate set to: " + rate + "%");
        } else {
            System.out.println("Interest rate cannot be negative");
        }
    }

    public void addInterest(){
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Added interest: " + interest);
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountDetails(){
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Maryam Siddique", 200000.0);

        account.displayAccountDetails();
        account.deposit(3000.0);
        account.withdraw(2000.0);
        account.setInterestRate(5.0);
        account.addInterest();

        System.out.println("FInal Balance: " + account.getBalance());


        System.out.println("Maryam Siddique");
        System.out.println("BSCS-KC-012");
    }
}

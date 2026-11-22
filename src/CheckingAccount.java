
public class CheckingAccount extends BankAccount {

    private double interestRate;

    public CheckingAccount() {
        interestRate = 0.025;
    }

    public void processWithdrawal(double amount) {
        balance -= amount;

        if (balance < 0) {
            balance -= 30;
            System.out.println("Overdraft fee assessed, $30 fee applied to account.");
        }
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate);
    }
}
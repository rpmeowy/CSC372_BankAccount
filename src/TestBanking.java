
public class TestBanking {

    public static void main(String[] args) {

        CheckingAccount account = new CheckingAccount();

        account.setFirstName("Oliver");
        account.setLastName("Lee");
        account.setAccountID(89725);

        account.deposit(650.00);

        System.out.println("After Deposit:");
        account.displayAccount();

        account.withdrawal(250.00);

        System.out.println("\nAfter Withdrawal:");
        account.displayAccount();

        account.processWithdrawal(500.00);

        System.out.println("\nAfter Overdraft Withdrawal:");
        account.displayAccount();
    }

}
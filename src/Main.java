public class Main {
    public static void main(String[] args) {


        BankAccount account = new BankAccount();
        account.deposit(15000);


        while (true) {
            try {
                account.withdraw(6000);

            } catch (LimitException e) {
                try {
                    account.withdraw(e.getRemainingAmount());
                    System.out.println("Withdrew the remaining amount: " + e.getRemainingAmount());
                } catch (LimitException limitException) {

                    limitException.printStackTrace();
                }
                break;
            }
        }
    }
}

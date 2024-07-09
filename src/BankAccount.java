public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            amount += sum;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Requested amount exceeds the current balance.", amount);
        }
        amount -= sum;
    }
}


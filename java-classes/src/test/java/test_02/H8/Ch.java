package test_02.H8;

public class Ch extends BankAccount {
    public Ch(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        super.setBalance(super.getBalance() - 1);
        System.out.println("余额："+super.getBalance());
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        super.setBalance(super.getBalance() - 1);
        System.out.println("余额："+super.getBalance());
    }
}

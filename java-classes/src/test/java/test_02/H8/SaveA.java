package test_02.H8;

public class SaveA extends BankAccount {
    private int today;
    private int total;
    public SaveA(double initialBalance,int today,int total) {
        super(initialBalance);
        this.today = today;
        this.total = total;
        if(this.today == 30 || this.today == 31){
            this.eMI();
        }

    }

    public int getToday() {
        return today;
    }

    public void setToday(int today) {
        this.today = today;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void eMI(){
        super.setBalance(super.getBalance()*1.1);
    }

    @Override
    public void deposit(double amount) {
        if (total <= 3){
            super.deposit(amount);
            System.out.println("余额：" + super.getBalance());
        } else {
            super.deposit(amount);
            super.setBalance(super.getBalance() - 1);
            System.out.println("余额：" + super.getBalance());
        }
    }

    @Override
    public void withdraw(double amount) {
        if (total <= 3){
            super.withdraw(amount);
        }else {
            super.withdraw(amount);
            super.setBalance(super.getBalance() - 1);
            System.out.println("余额：" + super.getBalance());
        }
    }
}

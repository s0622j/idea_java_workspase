package hsp.chapter08_oop02.encapsulation_03;

public class TestAccount_02 {
    public static void main(String[] args) {
        //创建Account
        Account_02 account = new Account_02();
        account.setName("jack");
        account.setBalance(60);
        account.setPwd("123456");

        account.showInfo();
    }
}

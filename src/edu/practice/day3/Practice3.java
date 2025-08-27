package edu.practice.day3;

import java.lang.annotation.Target;

public class Practice3 {
    private String accountHolder;
    private String accountNumber;
    private long balance;
    private String password;
    private int transactionCount = 0;

    public Practice3(){

    }

    public Practice3(String accountHolder, String accountNumber, long balance, String password) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.password = password;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    public void status(){
        System.out.println("=== " + getAccountHolder() + "님 계좌 정보 ===");
        System.out.println("계좌번호 : " + getAccountNumber());
        System.out.printf("잔액 : %,d\n", getBalance());
        System.out.println("총 거래 횟수 : " + getTransactionCount());
        System.out.println();
    }
    public void deposit(long amount){
        setBalance(getBalance()+amount);
        System.out.printf("%s님이 %,d원 입금하셨습니다. 현재 잔액: %,d원\n", getAccountHolder(), amount, getBalance());
        setTransactionCount(getTransactionCount()+1);
        System.out.println();
    }
    public void withdraw(String pw, long amount) {
        if (getPassword().equals(pw)) {
            setBalance(getBalance() - amount);
            System.out.printf("%s님이 %,d원 출금하셨습니다. 현재 잔액: %,d원\n", getAccountHolder(), amount, getBalance());
        } else {
            System.out.println("비밀번호가 일치하지 않습니다.");
        }
        setTransactionCount(getTransactionCount() + 1);
        System.out.println();
    }
    public void transfer(String pw, Practice3 TargetAccount, long amount){
        if (getPassword().equals(pw) && getBalance() >= amount) {
            setBalance(getBalance() - amount);
            TargetAccount.setBalance(TargetAccount.getBalance() + amount);
            System.out.printf("%s님이 %s님께 %,d원 송금했습니다.\n", getAccountHolder(), TargetAccount.getAccountHolder(), amount);
            System.out.printf("%s님 현재 잔액 : %,d원\n",getAccountHolder(),getBalance());
            System.out.printf("%s님 현재 잔액 : %,d원\n",TargetAccount.getAccountHolder(),TargetAccount.getBalance());
            setTransactionCount(getTransactionCount() + 1);
            TargetAccount.setTransactionCount(TargetAccount.getTransactionCount() + 1);
        } else if (getBalance() < amount && getPassword().equals(pw)) {
            System.out.println("잔액이 부족합니다.");
        } else {
            System.out.println("비밀번호가 일치하지 않습니다.");
        }
        System.out.println();
    }
    public void checkTransactionCount(){
        System.out.println("=== " + getAccountHolder() + "님 총 거래 횟수 ===");
        System.out.printf("총 %d회 거래를 하셨습니다\n", getTransactionCount());
        System.out.println();
    }
}

package com;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}

public class BankException {
    static void withdraw(int balance, int amount) throws InsufficientBalanceException{
        if(amount> balance) {
            throw new InsufficientBalanceException("Insufficient Balance...");
        }
        System.out.println("Transaction Successful");
        System.out.println("Remaining Balance = "+ (balance - amount));
        }

    public static void main(String[] args) {
        int balance= 1000;
        int amount= 1500;
        try{
            withdraw(balance, amount);
        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        }
    }
}

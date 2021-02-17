package com.classAndObject;

public class Account {
    int ac_no;
    String name;
    double amount;

    //method to initialize object
    void insert(int ac_no, String name, double amount){
        this.ac_no=ac_no;
        this.name=name;
        this.amount=amount;
    }

    //Deposit method
    void deposit(double amt){
        amount=amt+amount;
        System.out.println(amt+"is Deposited to the account");

    }

    //WithDraw Method
    void withdraw(double amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " is withdrawn from the account");
        }
    }

        //check balance method
        void checkBalance(){
            System.out.println("Total balance in account is: "+amount);
        }

        //method to display the values of an object
    void displayAccount(){
        System.out.println("account number: "+ac_no + " "+"Name is: "+name+" "+"Total amount is: "+amount);
    }


    public static void main(String[] args) {
        Account account = new Account();
        account.insert(1234,"Ram Karki", 5000);
        account.displayAccount();
        account.checkBalance();

        account.deposit(6000);
        account.checkBalance();

        account.withdraw(2000);
        account.checkBalance();


    }
}

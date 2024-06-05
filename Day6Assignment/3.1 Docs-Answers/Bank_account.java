package com.ey.day6.Q1;

import java.util.ArrayList;
import java.util.List;

class InvalidAmountException extends RuntimeException {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

class LowAmountException extends RuntimeException {
    LowAmountException(String msg) {
        super(msg);
    }
}

class Bankdet {
    int accno;
    String custname;
    String acctype;
    float balance;

    public Bankdet(int accno, String custname, String acctype, float balance) {
        this.accno = accno;
        this.custname = custname;
        this.acctype = acctype;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bankdet [accno=" + accno + ", custname=" + custname + ", acctype=" + acctype + ", balance=" + balance
                + "]";
    }
}

public class Bank_account {

    static void deposit(float amt) {
        if (amt < 0) {
            throw new InvalidAmountException("Do not enter negative numbers.");
        } else {
            System.out.println("Deposit done");
        }
    }

    static void withdraw(float amt) {
        if (amt < 1000) {
            throw new InvalidAmountException("Insufficient funds!!! Below 1000.");
        } else {
            System.out.println("Withdrawal done");
        }
    }

    static void withdraw1(float amt) {
        if (amt < 5000) {
            throw new InvalidAmountException("Insufficient funds!!! Below 5000.");
        } else {
            System.out.println("Withdrawal done");
        }
    }

    static float getbalance(float amt) {
        if (amt < 1000) {
            throw new LowAmountException("Low balance!!! Below " + amt);
        } else {
            return amt;
        }
    }

    public static void main(String[] args) {
        Bankdet b1 = new Bankdet(123, "sai", "savings", 100000f);

        List<Bankdet> l = new ArrayList<>();
        l.add(b1);

        deposit(10000f);
        float x = b1.balance - 90000f;

        if (b1.acctype.equals("savings")) {
            withdraw(x);
        } else if (b1.acctype.equals("current")) {
            withdraw1(x);
        }
        System.out.println("Balance: " + getbalance(x));
    }
}

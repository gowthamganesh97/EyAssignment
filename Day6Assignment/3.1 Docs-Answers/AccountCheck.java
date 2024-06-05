package com.ey.day6.Q1;

import java.util.*;

class AccountErrorException extends RuntimeException {
    AccountErrorException(String msg) {
        super(msg);
    }
}

public class AccountCheck {

    boolean isValidAccount(Set<Integer> keys, int a) {
        return keys.contains(a);
    }

    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1012, "ARUN");
        m.put(1013, "GANESH");
        m.put(2021, "KARTHICK");
        m.put(2067, "KAMAL");
        m.put(3067, "JOHN");

        Set<Integer> keys = m.keySet();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Account Number:");
        int acc = sc.nextInt();

        AccountCheck ac = new AccountCheck();
        boolean b = ac.isValidAccount(keys, acc);

        if (b) {
            System.out.println(m.get(acc));
        } else {
            throw new AccountErrorException("AccountNotFoundException");
        }
    }
}
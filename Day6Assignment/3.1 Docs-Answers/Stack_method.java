package com.ey.day6.Q1;

import java.util.Stack;
import java.util.EmptyStackException;

class Contactclass {
    String fname;
    String mname;
    String lname;
    String gender;
    int Mob_number;

    public Contactclass(String fname, String mname, String lname, String gender, int Mob_number) {
        super();
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.gender = gender;
        this.Mob_number = Mob_number;
    }

    @Override
    public String toString() {
        return "Contactclass [fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", gender=" + gender
                + ", Mob_number=" + Mob_number + "]";
    }
}

public class Stack_method {
    public static void main(String[] args) {
        Contactclass c1 = new Contactclass("Gowtham", "Ganesh", "E", "Male", 546728);

        Stack<Contactclass> s = new Stack<>();
        s.push(c1);
        System.out.println(s);

        try {
            s.pop();
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty. Cannot pop.");
        }

        Contactclass c2 = new Contactclass("Jai", "Ganesh", "S", "Male", 9825478);
        s.push(c2);
        System.out.println(s);
    }
}



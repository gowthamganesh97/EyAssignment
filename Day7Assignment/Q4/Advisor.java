package com.ey.day8.Q3;

import java.util.*;

public class Advisor extends Thread {
	
	String[] advise=new String[3];
	{
		advise[0]="Never begin to stop and never stop to begin.";
		advise[1]="Only destination isn’t important, one should enjoy the journey";
		advise[2]="impossible itself says ‘i m possible’";
	}
	public void run() {
		
		System.out.println(advise[(new Random()).nextInt(3)]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Advisor adv = new Advisor();
		System.out.println(Thread.activeCount());
		adv.start();
		System.out.println(Thread.activeCount());
		try {
			adv.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.activeCount());

	}

}
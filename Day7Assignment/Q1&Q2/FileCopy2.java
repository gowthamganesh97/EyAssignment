package com.ey.day8.Q1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 implements Runnable {
	private final Object lock;
	
	public FileCopy2(Object lock) {
		this.lock=lock;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (lock) {
			try {
				FileInputStream f1=new FileInputStream("D:\\\\Java(4.1)-Excercise\\\\temp.txt");
				FileOutputStream f2=new FileOutputStream("C:\\\\Java day 7\\\\image2.txt");
				int k;
				while((k=f1.read())!=-1) {
					f2.write(k);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				lock.notify();
				
			}
		}
	}
		
}
	
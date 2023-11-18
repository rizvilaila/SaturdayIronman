package com.upskill.java_7;

public class MultiThreading {
	// MultiThreading is a java feature that allows concurrent execution of two or more parts of a program.
	// Threads can be created by Using two mechanism;
	// 1. Extending the Thread Class
	// 2. Implementing the Runnable Interface. 

	public static void main(String[] args) {
		int n = 6;
		for (int i = 0; i < n; i++) {
			MultithreadingThread obj = new MultithreadingThread();
			obj.start();
			
			Thread obj2= new Thread(new MultithreadingRunnable());
			obj2.start();
		}

	}

}

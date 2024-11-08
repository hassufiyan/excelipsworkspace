package com.emids.interview.threads;

public class ConsumerAndProducerMainThread {

	public static void main(String[] args) throws InterruptedException {
		
		final PCThread pc=new PCThread();
		
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				
			try {
				pc.producer();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
				
			}
			
		}
				);
		Thread t2=new Thread(new Runnable()//this runnable Interface is implemented by thread class to show that this class 
				//is running currently...
				{
			@Override
			public void run() {
				try {
					pc.consumer();
				} catch (InterruptedException e) {
				System.out.println("Consumer Thread is running");
					e.printStackTrace();
				}
				
				
				
			}
			
			
			
			
				}
				
				
				
				
				
				
				
				
				);
		
t1.start();
t2.start();


t1.join();

t2.join();
	}

}

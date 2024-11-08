package com.emids.interview.threads;

import java.util.LinkedList;

public class PCThread {
	
	int capacity=2;
LinkedList<Integer> list=new LinkedList<Integer>(); 
	
	public void producer() throws InterruptedException
	{
		int value=0;
		
		
		while(true) {//this is infinte loop to add the items into the list...
	   synchronized(this) {//this block is to avoid muliple running of producers and consumer thread at same time...
		
		while(list.size()==capacity) 
		wait();
		
		
		System.out.println("Producer Produced : "+value);
		
		
		list.add(value++);//here the producer is adding the items into the list and next step notifying the consumer,
	
		notify();//it notifies the consumer that data has been added in the ist which can be consumed...
	
		Thread.sleep(1000);
		
	
	}
		}
		
	}
	
	
	public void consumer() throws InterruptedException
	{
	
while(true) {
	synchronized(this) {
		
	while(list.size()==0)
		wait();
	
	int v=list.removeFirst();
	
	System.out.println("Consumer Consumed :"+v);
	
	
	notify();
	
	Thread.sleep(10000);
		
		
	}
}
}
}

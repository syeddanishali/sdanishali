package com.prac;

public class RunnableDemo implements Runnable{
	
	protected RunnableDemo( String name){
	       threadName = name;
	       System.out.println("Creating " +  threadName );
	   }
	
	 private Thread t;
	   private String threadName;
	   
	@Override
	public void run() {
		System.out.println("Running " +  threadName );
		for(int i=1;i>0;i++){
			 System.out.println("Thread: " + threadName + ", " + i);
		}
		 System.out.println("Thread " +  threadName + " exiting.");
	}
	
	 
	   public void start ()
	   {
	      System.out.println("Starting " +  threadName );
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	 

}

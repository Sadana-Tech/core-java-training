package com.training.java8.funcintr;

public class DemoFuncInter {

	public static void main(String[] args) {
		
		
		 // create anonymous inner class object
        new Thread(new Runnable() {
            @Override public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
        
        new Thread(()-> {
        	System.out.println("Lambda thread");
        	
        }).start();

	}

}

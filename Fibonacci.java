// The main class Fibonacci and the place where the parent thread starts
// task 4.19
// Kristina Gancheva, group 1C 

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args){
		
		System.out.println("Enter a number bigger than 0!");
		
		// using the Scanner to read the user input 
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if(number <= 0){
			System.out.println("There is no Fibonacci sequence to be generated!");
		}
		
		// putting the number value in a shared between the threads class 
		new FibArray().setNumber(number);
		
		// making a new child thread
		FibThread FT = new FibThread();
		FT.start();
		
		// joining the threads allows the main thread to wait for the child
		try{
			FT.join();
			
			//getting the array from the shared class and printing it out
			int[] answer = new int[number];
			answer = new FibArray().getFA();
			
			for(int i = 0; i < answer.length ; i ++){
				System.out.print(answer[i] + ", ");
			}
			
		}catch(InterruptedException ie){}
	}
}

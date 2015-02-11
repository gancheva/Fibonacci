// Class FibThread which contains the child thread method run()
// task 4.19
// Kristina Gancheva, group 1C 

public class FibThread extends Thread {
	
	public void run(){
		
		// getting the value of number from the shared class
		int number = new FibArray().getNumber();
		
		//making an array for holding the Fibonacci sequence and checking which values have to be generated
		int[] fibSeq = new int[number];
		
		if (number == 1) fibSeq[0] = 0; 
		if (number == 2 ) { fibSeq[0] = 0; fibSeq[1] = 1;}
		if (number > 2) {
			fibSeq[0] = 0; fibSeq[1] = 1;
			for(int i = 2; i < number; i ++){
				fibSeq[i] = fibSeq[i-2] + fibSeq[i-1];
			}
		}
		
		// putting the array holding the answer in the shared class
		new FibArray().setFA(fibSeq);
	}
}

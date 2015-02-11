// Class FibArray which keeps the shared between the threads data  
// NB: synchronizing the methods here allows the threads to work with the correct data
// task 4.19
// Kristina Gancheva, group 1C 

public class FibArray {
	private static int[] FA;
	private static int number;
	
	public synchronized void setFA(int[] array){
		FA = array;
	}
	
	public static synchronized int[] getFA(){
		return FA;
	}
	
	public synchronized void setNumber(int n){
		number = n;
	}
	
	public static synchronized int getNumber(){
		return number;
	}

}


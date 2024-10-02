// Class named after the method which give this class its purpose.
public class ExponentialOddonacci {
	// This class contains the main method.
	public static void main(String[] args) {
		// Loop used to call expOddonacci() method with integers from 5 to 200, increasing by 5 each iteration.
		for(long i=5; i<200; i=i+5) {
			// Start time is captured before each call of the expOddonacci() method.
			long startTime = System.nanoTime();
			// Calls expOddonacci() using variable i.
			long result = expOddonacci(i);
			// End time is captured after each call of the expOddonacci() method.
			long endTime = System.nanoTime();
			// Results of each expOddonacci() call are printed to the console.
			System.out.println(String.format("%-13s","Oddonacci("+i+")")+" = "+String.format("%-19d",result)+" | Duration: "+ String.format("%12.7f",((endTime-startTime)/1000000000f))+" seconds");
		}
	}
	// expOddonacci() method is made up of a base case of k <= 3 and 3 recursive calls if base case conditions are not met.
	public static long expOddonacci(long k) {
		// Base case.
		if(k<=3) {
			return 1;
		} else {
			// If base case is not met, this method makes 3 recursive calls.
			return expOddonacci(k-1)+expOddonacci(k-2)+expOddonacci(k-3);
		}
	}
}
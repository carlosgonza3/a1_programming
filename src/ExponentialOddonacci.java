// Oddonacci Algorithm:
// Input: Nonnegative integer k.
// Output: the kth Oddonnacci number O(k).
// If k <= 3, return 1
// else, return binOddonacci(k - 1) + binOddonacci(k - 2) + binOddonacci(k - 3).

public class ExponentialOddonacci {
	public static void main(String[] args) {
		for(long i=5; i<200; i=i+5) {
			long startTime = System.nanoTime();
			long result = expOddonacci(i);
			long endTime = System.nanoTime();
			System.out.println(String.format("%-13s","Oddonacci("+i+")")+" = "+String.format("%-19d",result)+" | Duration: "+ String.format("%12.7f",((endTime-startTime)/1000000000f))+" seconds");
		}
	}
	public static long expOddonacci(long k) {
		if(k<=3) {
			return 1;
		} else {
			return expOddonacci(k-1)+expOddonacci(k-2)+expOddonacci(k-3);
		}
	}
}
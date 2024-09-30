// Oddonacci Algorithm:
// Input: Nonnegative integer k.
// Output: the kth Oddonnacci number O(k).
// 
// If k <= 3, return 1
// else, return binOddonacci(k - 1) + binOddonacci(k - 2) + binOddonacci(k - 3).

//import java.util.Scanner;

public class BinaryOddonacci {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int result = binOddonacci(sc.nextInt());
//		sc.close();
//		System.out.println("Result = " + result);
		for(int i = 5; i < 200; i = i + 5) {
			long startTime = System.nanoTime();
			binOddonacci(i);
			long endTime = System.nanoTime();
			System.out.println("Time for Oddonacci(" + i + ")" + " = " + (endTime - startTime)/1000000000.0 + " seconds");
		}
	}
	public static int binOddonacci(int k) {
		if(k <= 3) {
			return 1;
		} else {
			return binOddonacci(k - 1) + binOddonacci(k - 2) + binOddonacci(k - 3);
		}
	}
}
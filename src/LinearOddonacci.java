// Linear Oddonacci Algorithm
public class LinearOddonacci {

    public static void main(String[] args) {

        // Loop that starts at 5, and increments by steps oof 5, stops until 200
        for (int i=5; i<=200; i+=5) {
            // Used for calculating time taken to calculate Oddonacci(i)
            long startTime = System.nanoTime();
            // Calls the algorithm for finding Oddonacci(i) and stores in object of type Triple
            Triple oddonacci = LinearOddonacci(i);
            // Used for calculating time taken to calculate Oddonacci(i)
            long endTime = System.nanoTime();
            // Prints results into terminal
            System.out.println(String.format("%-13s","Oddonacci("+i+")")+" = "+String.format("%-11s",oddonacci)+" | Duration: "+ String.format("%11.7f",((endTime-startTime)/1000000000f))+" seconds");
        }
    }

    // Linear Oddonacci Algorithm -> input k is the Oddonacci number to calculate.
    // returns a triple which includes (Oddonacci number k, Oddonacci number k-1, Oddonacci number k-2)
    public static Triple LinearOddonacci(long k) {

        // Base case: returns first 3 predetermined (1, 1, 1) numbers  if and only if k<=3
        if (k<=3) {
            return new Triple(1, 1, 1);
        }
        // Recursive call: Returns a LinearOddonacci.Triple t where it includes (new Calculated Oddonacci number, current oddonacci number, previous oddonacci number)
        else {
            Triple t = LinearOddonacci(k-1);
            return new Triple(t.current+ t.prev+ t.prevprev, t.current, t.prev);
        }
    }
}

// Class used to return an object with 3 numbers
class Triple {

    // LinearOddonacci.Triple Member
    long current, prev, prevprev;

    // Constructor
    public Triple(long current, long prev, long prevprev) {
        this.current = current;
        this.prev = prev;
        this.prevprev = prevprev;
    }

    // To String method to display LinearOddonacci.Triple elements
    @Override
    public String toString() {
        return "("+current+", "+prev+", "+prevprev+")";
    }
}

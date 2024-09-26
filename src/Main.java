/*
    Pseudocode for calculating Oddonacci Numbers using Linear time:

    Function LinearOddonacci(k):
        if (k<=3)
            return (1, 1, 1)
        else
            (current, previous, secondPrevious) <- LinearOddonacci(k-1)
            return (current+previous+secondPrevious, current, previous)
 */

public class Main {

    public static void main(String[] args) {

        long totalStartTime = System.currentTimeMillis();

        for (int i=5; i<=200; i+=5) {
            long startTime = System.currentTimeMillis();
            Triple oddonacci = LinearOddonacci(i);
            long endTime = System.currentTimeMillis();
            long elapsed = endTime - startTime;
            System.out.println("Oddonacci("+i+"): "+oddonacci+" \t | \t Time elapsed: "+elapsed);
        }
        long totalEndTime = System.currentTimeMillis();
        long totalElapsed = totalEndTime - totalStartTime;
        System.out.println("Total Time Elapsed: "+totalElapsed);

    }

    // Linear Oddonacci Algorithm -> input k is the Oddonacci number to calculate.
    // returns a triple which includes (Oddonacci number k, Oddonacci number k-1, Oddonacci number k-2)
    public static Triple LinearOddonacci(long k) {

        // Base case: returns first 3 predetermined (1, 1, 1) numbers  if and only if k<=3
        if (k<=3) {
            return new Triple(1, 1, 1);
        }
        // Recursive call: Returns a Triple t where it includes (new Calculated Oddonacci number, current oddonacci number, previous oddonacci number)
        else {
            Triple t = LinearOddonacci(k-1);
            return new Triple(t.current+ t.prev+ t.prevprev, t.current, t.prev);
        }
    }
}

// Class used to return an object with 3 numbers
class Triple {

    // Triple Member
    long current, prev, prevprev;

    // Constructor
    public Triple(long current, long prev, long prevprev) {
        this.current = current;
        this.prev = prev;
        this.prevprev = prevprev;
    }

    // To String method to display Triple elements
    @Override
    public String toString() {
        return "("+current+", "+prev+", "+prevprev+")";
    }
}

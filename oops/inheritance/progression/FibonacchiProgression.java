package oops.inheritance.progression;

public class FibonacchiProgression extends Progression {

    protected long prev;


    public FibonacchiProgression() {
        this(0, 1);
    }



    public FibonacchiProgression(long first, long second) {
        super(first);
        prev = second - first;
    }

    protected void advance() {
       long temp = prev;
       prev = current;
       current += temp;
    }
}

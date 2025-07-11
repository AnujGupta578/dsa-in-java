package oops.inheritance.progression;

public abstract class AbstractProgression {
    protected long current;

    public AbstractProgression() {
        this(0);
    }

    public AbstractProgression(long start) {
        current = start;
    }

    public long nextValue() {
        long answer = current;
        advance();
        return answer;
    }

    protected abstract void advance();

    public void printProgression(int n) {
        System.out.println(nextValue());
        for (int j = 1; j < n; j++ ) {
            System.out.print(" "+ nextValue());
        }
        System.out.println();

    }
}

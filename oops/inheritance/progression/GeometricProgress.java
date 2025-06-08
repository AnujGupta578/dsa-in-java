package oops.inheritance.progression;

public class GeometricProgress extends Progression {

    protected long base;


    public GeometricProgress() {
        this(2, 1);
    }

    public GeometricProgress(long b) {
        this(b, 1);
    }

    public GeometricProgress(long b, long start) {
        super(start);
        base = b;
    }

    protected void advance() {
        current *= base;
    }
}

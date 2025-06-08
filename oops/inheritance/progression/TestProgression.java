package oops.inheritance.progression;

public class TestProgression {

    public static void main(String[] args) {
        Progression prog;

        // test arithmeticProgression

        System.out.print("Arithmetic progression with default increment: ");

        prog = new ArithmeticProgression();

        prog.printProgression(10);

        System.out.print("Arithmetic progression with increment 5: ");

        prog = new ArithmeticProgression(5);

        prog.printProgression(10);

        System.out.print("Arithmetic progression with start 2: ");

        prog = new ArithmeticProgression(5, 2);

        prog.printProgression(10);


        // test GeometricProgression

        System.out.print("Geometric progression with default increment: ");

        prog = new GeometricProgress(3);

        prog.printProgression(10);

//        test fibonacci Progression
        System.out.print("Fibonacci progression with default start value");

        prog = new FibonacchiProgression();

        prog.printProgression(10);

        System.out.print("Fibonacci  progression with start values 4 and 6: ");

        prog = new FibonacchiProgression(4, 6);

        prog.printProgression(8);
    }
}

package generics;

public class Main {
    public static void main(String[] args) {

        ObjectPair bid = new ObjectPair("ORCL", 32.7);

//        using generic class

        Pair<String, Double> _bid = new Pair<>("ORCL", 32.7);

//        defining generic type of Array
        /*
         * We would like to keep an array of Pair<String, Double> Objects
         * Such an array can be declared with a parametrized type, but it must be instantiated with an unparametrized type,
         * and then cast back to the parametrized type.
         */

        Pair<String, Double>[] holdings;

//        holdings = new Pair<String, Double>[25]; illegal and compiler error

        holdings = new Pair[25]; // corect but warning about unchecked cast
        // Unchecked assignment: 'generics. Pair[]' to 'generics. Pair<java. lang. String,java. lang. Double>[]'

        holdings[0] = new Pair<>("ORCL", 32.07);

    }
}

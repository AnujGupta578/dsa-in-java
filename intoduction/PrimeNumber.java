package intoduction;

public class PrimeNumber {

    public static void main(String[] args) {

        boolean isPrime = isNumPrime(1145364351);

        String str = isPrime ? "a prime" : " not a prime";

        System.out.println("Number is " + str ) ;
    }

    public static boolean isNumPrime(long num) {
        if(num < 2) {
            return true;
        }
        int c = 2;

        while(c < Math.sqrt(num)) {
            if(num % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}

package intoduction;

import java.math.BigInteger;

public class LargeNumber {

    public static void main(String[] args) {
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(60);

        BigInteger C = new BigInteger("45644545");


        BigInteger D = BigInteger.TEN;

        BigInteger s = A.add(C);

        System.out.println("Big int: " + s);
    }
}

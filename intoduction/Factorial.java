package intoduction;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {

        BigInteger factAns = fact(11);
        System.out.println(factAns);

        double x = 0.04;
        double y = 0.03;
        subDouble(x, y);

        BigDecimal a = BigDecimal.valueOf(0.04);
        BigDecimal b = BigDecimal.valueOf(0.03);

        BigDecimal(a, b);
    }

    static BigInteger fact(int num) {
        BigInteger ans = new BigInteger("1");

        for(int i =2; i <= num; i++ ) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }

        return ans;
    }

    static void subDouble(double x, double y) {
        double ans = x - y;

        System.out.println("double subs ans: " + ans);
    }

    static void BigDecimal(BigDecimal x, BigDecimal y) {

        BigDecimal ans = x.subtract(y);
        System.out.println(" big desimal ans:  "+ans);
    }
}

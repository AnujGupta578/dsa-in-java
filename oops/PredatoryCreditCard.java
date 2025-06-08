package oops;

public class PredatoryCreditCard extends CreditCard {

    private double apr; // annual percentage rate

    public PredatoryCreditCard(String cust, String bk, String acnt, int lim, double initialBal, double rate) {
        super(cust, bk, acnt, lim, initialBal);
        apr = rate;
    }

    public void processMonth() {
        if(balance > 0) {
            double monthlyFactor = Math.pow(1 + apr, 1.0/12);
            balance *= monthlyFactor;
        }
    }

    @Override
    public boolean charge(double price) {
        boolean isSuccess = super.charge(price);

        if(!isSuccess) {
            balance +=5;
        }
        return isSuccess;
    }
}

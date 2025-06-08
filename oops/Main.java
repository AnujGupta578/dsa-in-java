package oops;

public class Main {
    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];

        wallet[0] = new CreditCard("Anuj", "Bob Saving", "0001 0003 0004 0007", 5000);
        wallet[1] = new CreditCard("Akarsh", "SBI Saving", "0002 0045 0504 0107", 5000);
        wallet[2] = new CreditCard("Rajat", "Axis Saving", "0901 0073 6004 0507", 5000);


        CreditCard card = new PredatoryCreditCard("Anuj", "Bob Saving", "0001 0003 0004 0007", 5000, 1500, 8.5);

//        card.processMonth(); // this will not work due to card is a type of CreditCard not the type of PredatoryCreditCard

        card.charge(100);


    }
}

package edu.neu.csye7374;

public class Uber extends Stock{
    private double bidVal;

    public Uber() {
        super("Uber", 150.5, "Uber Eats Stock");
    }

    @Override
    public void setBid(String bid) {
        bidVal = Double.parseDouble(bid);
        System.out.println("Bid " + bidCount + " : " + bidVal);
        bidCount++;
    }

    @Override
    public int getMetric() {
        setPrice(getPrice() + (bidVal * 0.5));
        int performanceMetric = (int) (getPrice() / 50);
        return performanceMetric;
    }
}

package edu.neu.csye7374;

public class IBM extends Stock {
    private double bidVal;

    public IBM() {
        super("IBM", 131.15, "IBM Common Stock");
    }

    @Override
    public void setBid(String bid) {
        bidVal = Double.parseDouble(bid);
        System.out.println("Bid " + bidCount + " : " + bidVal);
        bidCount++;
    }

    @Override
    public int getMetric() {
        setPrice(getPrice() + (bidVal * 0.2));
        int performanceMetric = (int) (getPrice() / 10);
        return performanceMetric;
    }
}

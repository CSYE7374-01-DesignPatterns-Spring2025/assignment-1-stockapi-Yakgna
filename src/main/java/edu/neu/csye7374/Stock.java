package edu.neu.csye7374;

public abstract class Stock implements Tradable{
    private String id;
    private double price;
    private String description;

    protected int bidCount = 1;

    public Stock(String id, double price, String description) {
        this.id = id;
        this.price = price;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "\n<<<<<<<<<<<< Stock Name: " + id + " >>>>>>>>>>>>\n" +
                "<<<<<<<<<<<< Base Price: " + price + " >>>>>>>>>>>>\n" +
                "<<<<<<<<<<<< Description: " + description + " >>>>>>>>>>>>\n";
    }

    public static void demo() {
        Stock ibm = new IBM();
        Stock uber = new Uber();

        String[] ibmBids = {"140", "145.2", "152.3", "157.3", "162.2", "167.7"};
        String[] uberBids = {"150", "155.2", "162.3", "167.3", "172.2", "177.7"};

        System.out.println("<------------------------Bidding Start------------------------>");
        System.out.println(ibm);
        for (String str: ibmBids) {
            ibm.setBid(str);
            System.out.println("Performance Metric: " + ibm.getMetric());
        }
        System.out.println(uber);
        for (String str: uberBids) {
            uber.setBid(str);
            System.out.println("Performance Metric: " + uber.getMetric());
        }
        System.out.println("<------------------------Bidding Start------------------------>");
    }
}

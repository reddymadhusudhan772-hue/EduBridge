class InternetPlan {
    String planName;
    int dataLimit;
    double price;
    InternetPlan() {

        this("Basic");
    }
    InternetPlan(String planName) {
        this(planName, 2);
    }
    InternetPlan(String planName, int dataLimit) {
        this(planName, dataLimit, 299.0);
    }
    InternetPlan(String planName, int dataLimit, double price) {
        this.planName = planName;
        this.dataLimit = dataLimit;
        this.price = price;
    }
    void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Data Limit: " + dataLimit + " GB/day");
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }
    public static void main(String[] args) {
        InternetPlan p1 = new InternetPlan();
        InternetPlan p2 = new InternetPlan("Standard");
        InternetPlan p3 = new InternetPlan("Premium", 3);
        InternetPlan p4 = new InternetPlan("Unlimited", 5, 599.0);
        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}

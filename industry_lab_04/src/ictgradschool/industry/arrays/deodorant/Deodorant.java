package ictgradschool.industry.arrays.deodorant;

public class Deodorant {

    private String brand;
    private String fragrance;
    private boolean rollOn;
    private double price;

    public Deodorant(String brand, String fragrance,
                     boolean rollOn, double price) {

        this.brand = brand;
        this.fragrance = fragrance;
        this.rollOn = rollOn;
        this.price = price;
    }

    public String toString() {
        String info = brand + " " + fragrance;
        if (rollOn) {
            info = info + " Roll-On";
        } else {
            info = info + " Spray";
        }
        info +=  " Deodorant, \n$" + price;
        return info;
    }

    // TODO Implement all methods below this line.

    public double getPrice() {
        return Deodorant.this.price;
    }

    public String getBrand() {
        return Deodorant.this.brand;
    }

    public boolean isRollOn() {
        return Deodorant.this.rollOn;
    }

    public String getFragrance() {
        return Deodorant.this.fragrance;
    }

    public void setPrice(double price) {
        Deodorant.this.price = price;
    }

    public void setBrand(String brand) {
        Deodorant.this.brand = brand;

    }

    public void setFragrance(String fragrance) {
        Deodorant.this.fragrance = fragrance;
    }

    public boolean isMoreExpensiveThan(Deodorant other) {
        return Deodorant.this.price > other.price;
    }
}
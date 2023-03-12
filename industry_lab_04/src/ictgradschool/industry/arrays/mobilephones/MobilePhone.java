package ictgradschool.industry.arrays.mobilephones;

public class MobilePhone {

    // TODO Declare the 3 instance variables:
    private String brand;
    // model
    private  String model;
    // price
    private  double price;

    public MobilePhone(String brand, String model, double price) {
        // Complete this constructor method
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // TODO Uncomment these methods once the corresponding instance variable has been declared.
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    // TODO Insert getModel() method here
    public String getModel(){
        return model;
    }
    // TODO Insert setModel() method here
    public void setModel(String model){
        MobilePhone.this.model = model;
    }
    // TODO Insert getPrice() method here
    public double getPrice(){
        return MobilePhone.this.price;
    }
    // TODO Insert setPrice() method here
    public void setPrice(double price){
        MobilePhone.this.price = price;
    }
    // TODO Insert toString() method here

    @Override
    public String toString() {
        String newString = "";
        newString = brand + " which costs $" + price;
        return newString;
    }

    // TODO Insert isCheaperThan() method here
    public boolean isCheaperThan(MobilePhone other){
        return MobilePhone.this.price < other.price;
    }
    
    // TODO Insert equals() method here
    public boolean equals(MobilePhone other){
        return MobilePhone.this.brand.equals(other.brand);
    }


}



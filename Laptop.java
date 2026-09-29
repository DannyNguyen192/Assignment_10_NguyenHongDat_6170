package nguyenhongdat_6170.Exercise7;

import java.util.Date;
import java.util.Scanner;

public class Laptop extends Product {

    private int warrantyYears;
    private double discountPercent;

    public Laptop() {
    }

    public Laptop(int warrantyYears, double discountPercent) {
        this.warrantyYears = warrantyYears;
        this.discountPercent = discountPercent;
    }

    public Laptop(int warrantyYears, double discountPercent, String id, double basePrice, Date importDate, boolean isAvailable, int quantity) {
        super(id, basePrice, importDate, isAvailable, quantity);
        this.warrantyYears = warrantyYears;
        this.discountPercent = discountPercent;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("warranty years: " + getWarrantyYears());
        System.out.println("discount percent: " + getDiscountPercent());
        System.out.println("price: " + calculatePrice());
        System.out.println("-----");
    }

    @Override
    public void updateProduct() {
        super.updateProduct();
        Scanner sc = new Scanner(System.in);
        System.out.print("update warranty year: ");
        setWarrantyYears(Integer.parseInt(sc.nextLine()));
        System.out.print("update discount percent: ");
        setDiscountPercent(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public void addProduct() {
        super.addProduct();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter warranty year: ");
        setWarrantyYears(Integer.parseInt(sc.nextLine()));
        System.out.print("enter discount percent: ");
        setDiscountPercent(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public double calculatePrice() {
        double warrantyFee;
        if (getWarrantyYears() >= 3) {
            warrantyFee = getBasePrice() * 0.08;
        } else {
            warrantyFee = getBasePrice() * 0.03;
        }
        return (getBasePrice() + warrantyFee) * (1 - getDiscountPercent() / 100);
    }
}

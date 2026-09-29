package nguyenhongdat_6170.Exercise7;

import java.util.Date;
import java.util.Scanner;

public class Smartphone extends Product {

    private int storageGB;
    private double taxPercent;

    public Smartphone() {
    }

    public Smartphone(int storageGB, double taxPercent) {
        this.storageGB = storageGB;
        this.taxPercent = taxPercent;
    }

    public Smartphone(int storageGB, double taxPercent, String id, double basePrice, Date importDate, boolean isAvailable, int quantity) {
        super(id, basePrice, importDate, isAvailable, quantity);
        this.storageGB = storageGB;
        this.taxPercent = taxPercent;
    }

    public int getStorageGB() {
        return storageGB;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    public double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("storage GB: " + getStorageGB());
        System.out.println("tax percent: " + getTaxPercent());
        System.out.println("price: " + calculatePrice());
        System.out.println("-----");
    }

    @Override
    public void updateProduct() {
        super.updateProduct();
        Scanner sc = new Scanner(System.in);
        System.out.print("update storage GB: ");
        setStorageGB(Integer.parseInt(sc.nextLine()));
        System.out.print("update tax percent: ");
        setTaxPercent(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public void addProduct() {
        super.addProduct();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter storage GB: ");
        setStorageGB(Integer.parseInt(sc.nextLine()));
        System.out.print("enter tax percent: ");
        setTaxPercent(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public double calculatePrice() {
        double storageFee;
        if (getStorageGB() >= 512) {
            storageFee = getBasePrice() * 0.15;
        } else if (getStorageGB() >= 256) {
            storageFee = getBasePrice() * 0.1;
        } else {
            storageFee = getBasePrice() * 0.05;
        }
        return (getBasePrice() * storageFee) * (1 + getTaxPercent() / 100);
    }

}

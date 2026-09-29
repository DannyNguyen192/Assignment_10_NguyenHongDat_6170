package nguyenhongdat_6170.Exercise7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Product implements IProduct {

    private String id;
    private double basePrice;
    private Date importDate;
    private boolean isAvailable;
    private int quantity;

    public Product() {
    }

    public Product(String id, double basePrice, Date importDate, boolean isAvailable, int quantity) {
        this.id = id;
        this.basePrice = basePrice;
        this.importDate = importDate;
        this.isAvailable = isAvailable;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("enter id: ");
        setId(sc.nextLine());
        System.out.print("enter base price: ");
        setBasePrice(Double.parseDouble(sc.nextLine()));
        System.out.print("enter import date(dd/MM/yyyy): ");
        try {
            setImportDate(sdf.parse(sc.nextLine()));
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        System.out.print("enter is avialable: ");
        setIsAvailable(Boolean.parseBoolean(sc.nextLine()));
        System.out.print("enter quantity: ");
        setQuantity(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public void updateProduct() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("update base price: ");
        setBasePrice(Double.parseDouble(sc.nextLine()));
        System.out.print("update import date(dd/MM/yyyy): ");
        try {
            setImportDate(sdf.parse(sc.nextLine()));
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        System.out.print("update is avialable: ");
        setIsAvailable(Boolean.parseBoolean(sc.nextLine()));
        System.out.print("update quantity: ");
        setQuantity(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public void displayDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("-----");
        System.out.println("id: " + getId());
        System.out.println("base price: " + getBasePrice());
        System.out.println("import date: " + sdf.format(getImportDate()));
        System.out.println("is available: " + isIsAvailable());
        System.out.println("quantity: " + getQuantity());
    }

    @Override
    public abstract double calculatePrice();
}

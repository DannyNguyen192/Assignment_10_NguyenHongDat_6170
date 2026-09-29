package nguyenhongdat_6170.Exercise7;

import java.util.ArrayList;

public class ProductArrayList {

    private ArrayList<Product> products = new ArrayList<>();

    public void addProductToArray(Product product) {
        products.add(product);
    }

    public Product findProduct(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public void updateProductById(String id) {
        Product product = findProduct(id);
        if (product == null) {
            System.out.println("product not found");
        } else {
            product.updateProduct();
            System.out.println("update complete");
        }
    }

    public void deleteProductById(String id) {
        Product product = findProduct(id);
        if (product == null) {
            System.out.println("product not found");
        } else {
            products.remove(product);
            System.out.println("update complete");
        }
    }

    public void displayAllProducts() {
        if (!products.isEmpty()) {
            for (Product product : products) {
                product.displayDetails();
            }
        } else {
            System.out.println("empty list");
        }
    }

    public void displayAvailableProducts() {
        for (Product product : products) {
            if (product.isIsAvailable()) {
                product.displayDetails();
            }
        }
    }

    public double findHighestPrice() {
        double maxPrice = 0;
        for (Product product : products) {
            if (product.calculatePrice() > maxPrice) {
                maxPrice = product.calculatePrice();
            }
        }
        return maxPrice;
    }
}

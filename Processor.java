package nguyenhongdat_6170.Exercise7;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductArrayList products = new ProductArrayList();

        int option;
        System.out.println("=====MENU======");
        System.out.println("0. exit");
        System.out.println("1. add product");
        System.out.println("2. update product");
        System.out.println("3. delete product");
        System.out.println("4. display all");
        System.out.println("5. display available");
        System.out.println("6. highest price");

        do {
            System.out.print("enter option: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1: {
                    System.out.print("enter type (1-lap / 2-phone): ");
                    int type = Integer.parseInt(sc.nextLine());
                    if (type == 1) {
                        Product laptop = new Laptop();
                        laptop.addProduct();
                        products.addProductToArray(laptop);
                    } else {
                        Product phone = new Smartphone();
                        phone.addProduct();
                        products.addProductToArray(phone);
                    }
                    break;
                }
                case 2: {
                    System.out.print("enter id to update: ");
                    String id = sc.nextLine();
                    products.updateProductById(id);
                    break;
                }
                case 3: {
                    System.out.print("enter id to delete: ");
                    String id = sc.nextLine();
                    products.deleteProductById(id);
                    break;
                }
                case 4: {
                    products.displayAllProducts();
                    break;
                }
                case 5: {
                    products.displayAvailableProducts();
                    break;
                }
                case 6: {
                    System.out.println("highest price: " + products.findHighestPrice());
                    break;
                }
                case 0: return;
                default: System.out.println("invalid option"); break;
            }
        } while (option != 0);
    }
}

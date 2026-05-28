import java.util.ArrayList;

abstract class Product {

    int id;
    String name;
    int price;

    Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
        System.out.println("Price = " + price);
    }

    abstract void calculateTotalPrice();
}

interface Discountable {

    void applyDiscount();
}

class Electronics extends Product {

    int warrantyYears;

    Electronics(int id, String name, int price, int warrantyYears) {
        super(id, name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty Years = " + warrantyYears);
    }

    @Override
    void calculateTotalPrice() {
        int total = price + (price * 18 / 100);
        System.out.println("Total Price = " + total);
    }
}

class Clothing extends Product implements Discountable {

    int size;

    Clothing(int id, String name, int price, int size) {
        super(id, name, price);
        this.size = size;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Size = " + size);
    }

    @Override
    void calculateTotalPrice() {
        int total = price + (price * 5 / 100);
        System.out.println("Total Price = " + total);
    }

    @Override
    public void applyDiscount() {

        int discountedPrice = price - (price * 10 / 100);

        System.out.println("Discounted Price = " + discountedPrice);
    }
}

public class ShoppingSystem {

    public static void main(String[] args) {

        Electronics e1 = new Electronics(1, "Laptop", 50000, 2);

        Clothing c1 = new Clothing(2, "T-Shirt", 1000, 42);

        ArrayList<Product> products = new ArrayList<>();

        products.add(e1);
        products.add(c1);

        for (Product p : products) {

            p.displayDetails();
            p.calculateTotalPrice();

            System.out.println();
        }

        Discountable d = new Clothing(3, "Hoodie", 2000, 44);

        d.applyDiscount();
    }
}

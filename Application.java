    abstract class Abs_Application {
        String brand;
        int price;

        Abs_Application(String brand, int price) {
    this.brand = brand;
    this.price = price;
}
        abstract void turnOn();
        abstract void turnOff();
    }
    class  WashingMachine extends Abs_Application{
        WashingMachine(String brand, int price) {
    super(brand, price);
}
        @Override
        void turnOn(){
            System.out.println("WashingMachine ON");
        }
    void washClothes(){
        System.out.println("Cloth Washed...");
        }
        @Override
        void turnOff(){
            System.out.println("WashingMachine Off");
        }
        void displayDetails() {
    System.out.println("Brand: " + brand);
    System.out.println("Price: " + price);
}
    }
    class Refrigerator extends Abs_Application{

        Refrigerator(String brand, int price) {
    super(brand, price);
}
        @Override
        void turnOn(){
            System.out.println("Fridge On");
        }
        void makeIce(){
            System.out.println("Ice Making...");
        }
        @Override
        void turnOff(){
            System.out.println("Fridge off...");
        }

        void displayDetails() {
    System.out.println("Brand: " + brand);
    System.out.println("Price: " + price);
}
    }
    public class Application {
    public static void main(String[] args) {
        WashingMachine wm=new WashingMachine("LG", 19000);
        wm.turnOn();
        wm.washClothes();
        wm.turnOff();
        wm.displayDetails();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Refrigerator fridge=new Refrigerator("Sony",25000);
        fridge.turnOn();
        fridge.makeIce();
        fridge.turnOff();
        fridge.displayDetails();
    }
        
    }


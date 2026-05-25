public class Vehicle {

    void start() {
        System.out.println("Vehicle Started...");
    }

    void stop() {
        System.out.println("Vehicle Stopped...");
    }

    public static void main(String[] args) {

        Car c = new Car();
        c.start();
        c.openSunroof();
        c.stop();

        System.out.println();

        Bike b = new Bike();
        b.start();
        b.wheelie();
        b.stop();

        System.out.println();

        Truck t = new Truck();
        t.start();
        t.loadCargo();
        t.stop();

        System.out.println("---- Polymorphism ----");

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Truck();

        v1.start();
        v1.stop();

        System.out.println();

        v2.start();
        v2.stop();

        System.out.println();

        v3.start();
        v3.stop();
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car started with button");
    }

    void openSunroof() {
        System.out.println("Sunroof Opened");
    }
}

class Bike extends Vehicle {

    void wheelie() {
        System.out.println("Bike doing wheelie");
    }

    @Override
    void stop() {
        System.out.println("Stopped by engine braking");
    }
}

class Truck extends Vehicle {

    void loadCargo() {
        System.out.println("Cargo Loaded...");
    }
}

    public class Vehicle {
    void start(){
        System.out.println("Vehicle Started...");
    }
    void stop(){
        System.out.println("Vehicle Stopped...");
    }
        public static void main(String[] args) {
            
            Car c=new Car();
            c.start();
            c.opensunroof();
            c.stop();

            Bike b=new Bike();
            b.start();
            b.wheelie();
            b.stop();

            Truck t=new Truck();
            t.start();
            t.loadCargo();
            t.stop();
        }

    }
    class Car extends Vehicle{
        @Override
        void start(){
            System.out.println("Started with Button");
        }
        void opensunroof() {
            System.out.println("SunRoof Opened");
        }
    }
    class Bike extends Vehicle{
        
        void wheelie(){
            System.out.println("Wheeliee...");
        }
        @Override
        void stop(){
            System.out.println("Stopped by engine breaking");
        }
    }
    class Truck extends Vehicle{
        void loadCargo(){
            System.out.println("Cargo Loaded...");
        }
    }

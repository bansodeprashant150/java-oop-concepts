public class car {
    String brand;
    int speed;
    double fuel;
    void showStatus(){
        System.out.println("Brand -"+brand);
        System.out.println("Speed -"+speed);
        System.out.println("Fuel -"+fuel);
    }
    public static void main(String[] args) {
        car c1=new car();
        c1.brand="Ferrari";
        c1.speed=80;
        c1.fuel=10.9;
        c1.showStatus();
    }
}

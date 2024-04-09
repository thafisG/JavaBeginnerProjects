public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();

        c1.name = "Corolla";
        c1.brand = "Toyota";
        c1.year = 2022;
        c1.speedUp(20);
        c1.brake(10);
        c1.honk();

        System.out.println("Car name: " + c1.name);
        System.out.println("Car brand: " + c1.brand);
        System.out.println("Car year: " + c1.year);
        System.out.println("Car speed: " + c1.speed);
    }
}

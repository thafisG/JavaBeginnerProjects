public class Car{
    // attribute
    String name;
    String brand;
    int year;
    int speed;

    // method
    void speedUp(int acceleration){
        speed+=acceleration;
    }
    void brake(int reduce){
        speed-=reduce;
    }
    void honk(){
        System.out.println("bibibibi");
    }

}

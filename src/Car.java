public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name , String engine){
        this.engine = engine;
        this.name = name;
        numberOfCars++;
    }
}
class testProperty{
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3 ","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }

}

public class Task2_id9161 {
    public static void main(String[] args) {
        Car car1 = new Car("1st Car", "Lexus");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("2nd Car", "Lamborghini");
        System.out.println(Car.numberOfCars);
    }
}

class Car {
    private String name;
    private String brand;

    static int numberOfCars;

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
        numberOfCars++;
    }
}

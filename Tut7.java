public class Tut7 {
    public static void main(String[] args) {
        Car car = new Car("1NE-234", (float) 40.0, "black");
        ElectricCar ecar = new ElectricCar("T35L4", (float) 40.0, "cherry red", (float) 60.0);

        System.out.println(car);
        System.out.println(ecar);
        System.out.println("---");
        car.accelerate(10);
        ecar.accelerate(10);
        System.out.println(car);
        System.out.println(ecar);
    }
}

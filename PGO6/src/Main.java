public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Chevrolet", "Impala", 1967, 15000, 500);
        Vehicle truck = new Truck("Ford", "F-150", 2019, 20000, 1000, 5);

        System.out.println(car);
        System.out.println(truck);
    }
}

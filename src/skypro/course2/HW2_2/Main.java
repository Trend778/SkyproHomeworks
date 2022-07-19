package skypro.course2.HW2_2;

public class Main {
    public static void main(String[] args) {
        WheeledTransport car = new Car("car", 4);
        WheeledTransport car2 = new Car("car2", 4);
        WheeledTransport truck = new Truck("truck1", 4);
        WheeledTransport truck2 = new Truck("truck2", 8);
        WheeledTransport bicycle = new Bicycle("bicycle1", 2);
        WheeledTransport bicycle2 = new Bicycle("bicycle2", 2);

        car.setModelName("car1");
        truck.setWheelsCount(6);

        ServiceStation station = new ServiceStation();
        station.check(bicycle);
        station.check(bicycle2);
        station.check(car);
        station.check(car2);
        station.check(truck);
        station.check(truck2);

    }
}
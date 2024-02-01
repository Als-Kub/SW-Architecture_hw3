package OCP;

public class MainOCP {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(250, "Bike");
        printVehicleMaxSpeed(vehicle);
        vehicle = new Car(230);
        printVehicleMaxSpeed(vehicle);
        vehicle = new Bus(120);
        printVehicleMaxSpeed(vehicle);
    }

    public static void printVehicleMaxSpeed(Vehicle vehicle) {
        System.out.println(vehicle.type + " Max speed - " + vehicle.calculateAllowedSpeed());
    }
}

package Part_2;

public class Server {
    private int[] countVehicles;
    private int commonCountVehicles;
    private int limitVehicle;
    private Machine[] vehicles;

    public Server(int size) {
        countVehicles = new int[size];
        limitVehicle = size;
        vehicles = new Machine[limitVehicle];
    }

    public int getLimitVehicle() {
        return limitVehicle;
    }

    public int getCurrentCountVehicle() {
        return commonCountVehicles;
    }

    public void addTransport(int numberVehicles, Machine vehicle) {
        System.out.println("Vehicle № = " + getCurrentCountVehicle());
        countVehicles[numberVehicles]++;
        commonCountVehicles++;
        vehicles[numberVehicles] = vehicle;
        Machine.move(countVehicles[numberVehicles]);
    }
}
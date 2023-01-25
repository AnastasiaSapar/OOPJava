import Part_1.*;

public class Main {
    public static void main(String[] args)
    {
        Server servers = new Server(10);
        for (int i = 0; i < servers.getLimitVehicle(); i++)
        {
            Vehicle vehicles;
            int randoms = (int)(1 + Math.random() * 4);
            switch(randoms)
            {
                case 1: vehicles = new Car();
                    break;
                case 2: vehicles = new Bicycle();
                    break;
                case 3: vehicles = new Jumper();
                    break;
                case 4: vehicles = new RollerSkates();
                    break;
                default: vehicles = null;
                    break;
            }
            servers.addTransport(randoms, vehicles);
        }
    }
}
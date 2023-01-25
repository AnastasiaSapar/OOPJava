package Part_2;

public class Main {
    public static void main(String[] args)
    {
        Server servers = new Server(10);
        for (int i = 0; i < servers.getLimitVehicle(); i++)
        {
            Machine vehicles;
            int randoms = (int)(1 + Math.random() * 3);
            switch(randoms)
            {
                case 1: vehicles = new TractorWheeled("Tractor red", 20, 45, 0, "wheeled");
                    break;
                case 2: vehicles = new TractorCrawler("Tractor blue", 50, 25, 0, "crawler");
                    break;
                case 3: vehicles = new Bus("Bus yellow", 120, 110, 27);
                    break;
                default: vehicles = null;
                    break;
            }
            servers.addTransport(randoms, vehicles);
        }
    }
}
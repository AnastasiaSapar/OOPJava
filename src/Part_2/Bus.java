package Part_2;

public class Bus extends Machine{
    private  int passangers;
    public Bus(String name, int maxSpeed, int weight, int passangers){
        super(name, maxSpeed, weight, passangers);
    }

    void manegePassangers(){
        System.out.println("Bus have: " + passangers + " passangers.");
    }
}

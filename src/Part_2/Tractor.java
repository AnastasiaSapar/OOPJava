package Part_2;

public abstract class Tractor extends Machine{
    String type;
    public Tractor(String name, int maxSpeed, int weight, int passengers, String type)
    {
        super(name, maxSpeed, weight, passengers);
        this.type = type;
    }
    public void manegePassangers(){
        System.out.println("Tractor have: " + passengers + " passangers onboard.");
    }
}
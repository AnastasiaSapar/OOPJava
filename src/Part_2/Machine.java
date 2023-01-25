package Part_2;

public abstract class Machine implements Run{
    static String name;
    int weight;
    int maxSpeed;
    int passengers;

    public Machine(String name, int maxSpeed, int weight, int passengers)
    {
        this.name = name;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.passengers = passengers;
    }

    public String getName()
    {
        return name;
    }
    public int getMaxSpeed()
    {
        return maxSpeed;
    }
    public int getWeight()
    {
        return weight;
    }
    abstract void manegePassangers();
    public static void move(int id)
    {
        System.out.println("Machine " + name + " " + id + " moved.");
    }
}
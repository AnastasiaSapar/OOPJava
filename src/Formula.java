public class Formula {
    private float x, y, z;
    private float b;
    public void set(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getB(){
        return b;
    }
    void run(){
        b = (float) (Math.sqrt(10 * (Math.cbrt(x) + Math.pow(x, y+2))) * (Math.asin(z) * Math.asin(z) - Math.abs(x - y)));
    }
    void print(){
        System.out.println("For x = " + x + " y = " + y + " z = " + z + " b() = " + b);
    }
}

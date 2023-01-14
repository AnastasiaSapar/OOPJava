public class Main {
    public static void main(String[] args){
        int a = 0;
        int b = 0;
        a = (int) (20 + Math.random() * (30 - 20));
        b = (int) (40 + Math.random() * (50 - 40));
        System.out.println("a = " + a + ";" + " b = " + b + ";");
        System.out.println(myNumbersProcessing(a,b));
    }
    static int myNumbersProcessing(int a, int b){
        System.out.println("Suma a + b = " + (a + b));
        System.out.println("Dobutoc a * b = " + (a * b));
        return 0;
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(5, 0.01f, 0.002f, 0.3f);
        calc.set(0.01655f, -2.75f, 0.15f);
        calc.calculate();
        calc.print();
    }
}
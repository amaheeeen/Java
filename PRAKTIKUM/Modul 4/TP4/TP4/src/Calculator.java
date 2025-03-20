public class Calculator {
    // Static method untuk menambah 2 nomor
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Non-static method untuk mengalikan 2 nomor
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        // Static method call
        int sum = Calculator.add(2, 3); 
        System.out.println("Sum: " + sum);

        // Non static method call
        Calculator calc = new Calculator();
        int product = calc.multiply(2, 3); 
        System.out.println("Product: " + product);
    }
}

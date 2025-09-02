package in.kmit.MyJavaProject;

public class Calculator {

    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int num1 = 10;
        int num2 = 5;

        int sum = calc.add(num1, num2);
        int difference = calc.subtract(num1, num2);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
    }
}

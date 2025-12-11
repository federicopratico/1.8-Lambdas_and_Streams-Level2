package Level2.Ex3;

public class Main {
    public static void main(String[] args) {
        Calculator sum = (a,b) -> (float) (a + b);
        Calculator subtract = (a, b) -> (float) (a - b);
        Calculator multiply = (a, b) -> (float) (a * b);
        Calculator divide = (a, b) -> (float) (a / b);

        System.out.println("Calculator sum: " + sum.operation(3,5));
        System.out.println("Calculator subtract: " + subtract.operation(3,5));
        System.out.println("Calculator multiply: " + multiply.operation(3,5));
        System.out.println("Calculator divide: " + divide.operation(3,5));
    }
}

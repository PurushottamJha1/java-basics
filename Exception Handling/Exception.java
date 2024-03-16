public class Exception {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        }
    }
    // using throw 
    public static void divideByZero() {
        int  dividend =  2;
        int divisor = 0;

        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        int result = dividend / divisor;
        System.out.println("Result: " + result);
    }
    // using throws
    public static void divideByZeroWithThrows() throws ArithmeticException {
        int  dividend = 2;
        int divisor = 0;

        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        int result = dividend / divisor;
        System.out.println("Result: " + result);
    }
}
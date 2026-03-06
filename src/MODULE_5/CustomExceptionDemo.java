package MODULE_5;

// Custom Exception Class
class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            int number = -5;

            if (number < 0) {
                throw new MyException("Number cannot be negative");
            }

            System.out.println("Valid number");
        }
        catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

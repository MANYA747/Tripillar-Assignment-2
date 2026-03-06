package MODULE_5;
public class AgeCheck {
    public static void main(String[] args) {
        int age = 16;

        if (age < 18) {
            throw new ArithmeticException("Age is less than 18, not eligible");
        } else {
            System.out.println("Eligible");
        }
    }
}

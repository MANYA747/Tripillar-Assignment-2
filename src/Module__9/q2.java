package Module__9;
import java.util.Scanner;
public class q2 {
        static int sumDigits(int n) {
            if (n == 0) {   // Base case
                return 0;
            }
            return (n % 10) + sumDigits(n / 10);  // Recursive case
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int result = sumDigits(n);
            System.out.println("Sum of digits: " + result);
            sc.close();
        }
    }


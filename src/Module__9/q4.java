package Module__9;
import java.util.Scanner;
public class q4 {
        static void generateBinary(int n, String current) {
            if (current.length() == n) {   // Base case
                System.out.println(current);
                return;
            }
            generateBinary(n, current + "0");
            generateBinary(n, current + "1");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter value of n: ");
            int n = sc.nextInt();

            generateBinary(n, "");

            sc.close();
        }
    }


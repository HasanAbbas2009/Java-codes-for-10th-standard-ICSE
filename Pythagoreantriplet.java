import java.util.Scanner;

public class Pythagoreantriplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number greater than 1: ");
        int m = scanner.nextInt();
        if (m > 1) {
            // Calculation
            int a = 2 * m;
            int b = m * m - 1;
            int c = m * m + 1;
            // Display
            System.out.println("The Pythagorean triplet for m = " + m + " is: " + a + ", " + b + ", " + c);
        } else {
            System.out.println("The value of 'm' should be greater than 1.");
        }
    }
}

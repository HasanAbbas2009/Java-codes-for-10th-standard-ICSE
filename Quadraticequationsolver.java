import java.util.Scanner;
public class Quadraticequationsolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user input for coefficients a, b, c
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        // Calculating discriminant
        double discriminant = b * b - 4 * a * c;

        // Finding the nature of the roots and calculating the roots
        if (discriminant >= 0) {
            // Roots are real and different or real and same
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real.");
            System.out.printf("Root 1: %.2f\n", root1);
            System.out.printf("Root 2: %.2f\n", root2);
        } else {
            // Roots are imaginary
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are imaginary.");
            System.out.printf("Root 1: %.2f + %.2fi\n", realPart, imaginaryPart);
            System.out.printf("Root 2: %.2f - %.2fi\n", realPart, imaginaryPart);
        }
    }
}

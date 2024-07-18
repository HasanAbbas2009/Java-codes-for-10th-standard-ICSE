import java.util.Scanner;
public class Natureofrootfinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //user input
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();
        // Calculating discriminant
        double discriminant = b * b - 4 * a * c;
        // Determining the nature
        if (discriminant >= 0) {
            System.out.println("Roots are real.");

            // Calculate the roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            // Display the roots
            System.out.printf("Root 1: %.2f\n", root1);
            System.out.printf("Root 2: %.2f\n", root2);
        } else {
            System.out.println("Roots are imaginary.");
        }
    }
}

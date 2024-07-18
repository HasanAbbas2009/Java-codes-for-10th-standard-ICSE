import java.util.Scanner;
public class Sphereradiusfinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //user input for the volume of the sphere
        System.out.print("Enter the volume of the sphere: ");
        double volume = scanner.nextDouble();
        // Calculate the radius
        double radius = Math.cbrt(volume * (3.0 / 4.0) * (7.0 / 22.0));
        // Display
        System.out.printf("The radius of the sphere is: %.2f\n", radius);

    }
}

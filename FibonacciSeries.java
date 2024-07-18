import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms for the Fibonacci series
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int numTerms = scanner.nextInt();

        // Display the Fibonacci series
        System.out.println("Fibonacci Series:");
        displayFibonacciSeries(numTerms);
    }

    // Method to display the Fibonacci series
    private static void displayFibonacciSeries(int numTerms) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < numTerms; i++) {
            System.out.print(firstTerm + " ");

            // Calculate the next term by adding the previous two terms
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

import java.util.Scanner;

public class NumberChecker {

    
    public void checkMagicNumber(int num) {
        int sum = num;
        while (sum >= 10) {
            sum = sumOfDigits(sum);
        }
        if (sum == 1) {
            System.out.println(num + " is a Magic Number.");
        } else {
            System.out.println(num + " is not a Magic Number.");
        }
    }

    
    public int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    
    public boolean isHarshadNumber(int num) {
        int sum = sumOfDigits(num);
        return num % sum == 0;
    }

        public void checkMultipleHarshadNumber(int num, int multiple) {
        if (isHarshadNumber(num) && num % multiple == 0) {
            System.out.println(num + " is a Multiple Harshad Number.");
        } else {
            System.out.println(num + " is not a Multiple Harshad Number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberChecker numberChecker = new NumberChecker();

        
        System.out.print("Enter a number to check if it is a Magic Number: ");
        int magicNum = scanner.nextInt();
        numberChecker.checkMagicNumber(magicNum);

        
        System.out.print("Enter a number to check if it is a Multiple Harshad Number: ");
        int harshadNum = scanner.nextInt();
        System.out.print("Enter the multiple: ");
        int multiple = scanner.nextInt();
        numberChecker.checkMultipleHarshadNumber(harshadNum, multiple);

        scanner.close();
    }
}

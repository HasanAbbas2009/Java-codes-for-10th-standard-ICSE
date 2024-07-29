//A number is said to be a magic number if the eventual sum of digits of the number is one. Sample Input : 55 Then, 5 + 5 = 10, 1 + 0 = 1 Sample Output: Hence, 55 is a Magic Number. Similarly, 289 is a Magic Number
import java.util.*;
public class Magicnumber
{
public static void main(String args[])
        {
        int n, rem = 1, number, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to check: ");
        n = sc.nextInt();
        number = n;
        while (number > 9) 
            {
            while (number > 0)
                {
                rem = number % 10;
                sum = sum + rem;
                number = number / 10;
                }
            number = sum;
            sum = 0;
            }
        if (number == 1)
            {
            System.out.println("The given number is a magic number.");
            }
            else
            {
            System.out.println("The given number is not a magic number.");
            }
        }
        }

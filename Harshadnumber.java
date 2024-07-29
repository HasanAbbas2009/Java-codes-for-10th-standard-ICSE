//Harshad number A number is said to be the Harshad number if it is divisible by the sum of its digit. For example, if number is 156, then sum of its digit will be 1 + 5 + 6 = 12. Since 156 is divisible by 12. So, 156 is a Harshad number
public class Harshadnumber
{
        public static void main(String[] args) {
        int num = 156;
        int rem = 0, sum = 0, n;
                
        n = num;
        
        while(num > 0){
                rem = num%10;
                sum = sum + rem;
                num = num/10;
        }
        
        if(n%sum == 0)
                System.out.println(n + " is a harshad number");
            else
                System.out.println(n + " is not a harshad number");
    }
}

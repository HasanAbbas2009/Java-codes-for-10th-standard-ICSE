import java.util.Scanner;

public class BILLING_MACHINE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod[] = new int[5];
        int price[] = new int[5];
        int qty[] = new int[5];
        int tc[] = new int[5];
        int s1 = 0, s2 = 0, s3 = 0;

        System.out.println("ENTER CODE, PRICE AND QUANTITY");

        for (int i = 0; i < 5; i++) {
            cod[i] = sc.nextInt();
            price[i] = sc.nextInt();
            qty[i] = sc.nextInt();
            s1 += price[i];
            s2 += qty[i];
            tc[i] = price[i] * qty[i];
            s3 += tc[i];
        }

        System.out.println("CODE\tPRICE\tQTY\tTOTAL");

        for (int i = 0; i < 5; i++) {
            System.out.println(cod[i] + "\t" + price[i] + "\t" + qty[i] + "\t" + tc[i]);
        }

        System.out.println("SUM OF PRICE: " + s1);
        System.out.println("TOTAL ITEMS: " + s2);
        System.out.println("SUM OF TOTAL: " + s3);
    }
}

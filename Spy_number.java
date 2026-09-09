import java.util.Scanner;
public class Spy_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            product = product * digit;
            n = n / 10;
        }
        if (sum == product) {
            System.out.println(original + " is a Spy number.");
        } else {
            System.out.println(original + " is not a Spy number.");
        }
        sc.close();
    }
}

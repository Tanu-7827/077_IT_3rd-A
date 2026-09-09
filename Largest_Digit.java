import java.util.Scanner;
public class Largest_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int largestDigit = -1;
        while (n != 0) {
            int digit = n % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            n = n / 10;
        }
        System.out.println("Largest digit in " + original + " is " + largestDigit);
        sc.close();
    }
}

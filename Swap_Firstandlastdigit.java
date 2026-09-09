import java.util.Scanner;
public class Swap_Firstandlastdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int lastDigit = n % 10;
        int firstDigit = 0;
        while (n >= 10) {
            n = n / 10;
        }
        firstDigit = n;
        int swapped = lastDigit * (int) Math.pow(10, (int) Math.log10(original)) + (original / 10) * 10 + firstDigit;
        System.out.println("Original number: " + original);
        System.out.println("Number after swapping first and last digits: " + swapped);
        sc.close();
    }
}

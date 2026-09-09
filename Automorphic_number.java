import java.util.Scanner;
public class Automorphic_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int square = n * n;
        int original = n;
        while (n != 0) {
            if (n % 10 != square % 10) {
                System.out.println(original + " is not an Automorphic number.");
                sc.close();
                return;
            }
            n = n / 10;
            square = square / 10;
        }
        System.out.println(original + " is an Automorphic number.");
        sc.close();
    }
}

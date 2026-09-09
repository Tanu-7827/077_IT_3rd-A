import java.util.Scanner;
public class Duck_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        boolean isDuck = false;
        while (n != 0) {
            if (n % 10 == 0) {
                isDuck = true;
                break;
            }
            n = n / 10;
        }
        if (isDuck) {
            System.out.println(original + " is a Duck number.");
        } else {
            System.out.println(original + " is not a Duck number.");
        }
        sc.close();
    }
}

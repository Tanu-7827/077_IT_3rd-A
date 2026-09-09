import java .util.Scanner;
public class Harshad_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        if (original % sum == 0) {
            System.out.println(original + " is a Harshad number.");
        } else {
            System.out.println(original + " is not a Harshad number.");
        }
        sc.close();
    }

}

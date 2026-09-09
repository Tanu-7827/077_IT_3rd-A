import java.util.Scanner;

public class product_of_digit {
    //multiply all the digits of a number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int product = 1;
        while (n != 0) {
            int digit = n % 10;
            product = product * digit;
            n = n / 10;
        }
        System.out.println("Product of digits: " + product);
        sc.close();
    }
}

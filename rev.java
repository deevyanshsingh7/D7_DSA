import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        while (n != 0) {
            r = n % 10;
            n = n / 10;
            System.out.print(r); // Print without a newline
        }
        sc.close(); // Close the scanner object
    }
}

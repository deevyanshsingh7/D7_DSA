
import java.util.*;
public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int prime = 0;
        
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                prime++;
                break;
            }
        }
        
        if (prime != 0) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
        
        sc.close(); // Close the scanner to prevent resource leak
    }
}

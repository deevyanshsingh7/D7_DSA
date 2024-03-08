import java.lang.Math;
import java.util.*;
// bianry to decimal
public class bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(binTODECIMAL(n));
    }

    public static int binTODECIMAL(int n){
        double sum = 0;
        int power = 0;
        while(n != 0){
            int r = n%10;
            n = n/10;
            double powans = Math.pow(2,power);
            sum = sum+r*powans;
            power++;
     
        int intValue = (int) sum; // Casting double to int

        return intValue ;
    }
}

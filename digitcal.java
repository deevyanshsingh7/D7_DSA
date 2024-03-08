import java.util.*;
/*Take the following as input.
A number
A digit
Write a function that returns the number of times digit is found in the number. Print the value returned.*/

public class digitcal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = sc.nextInt();
        int ans = digCal(n,digit);
        System.out.println(ans); 
    }

    public static int digCal(int number,int digit){
        int count =0;
        while(number != 0){
            int r = number%10;
            int n = number/10;
            if(r == digit){
                count++;
            }
        }
        return count;
        
    }
}

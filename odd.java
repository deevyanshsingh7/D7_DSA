import java.util.*;
// Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.
public class odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumodd=0;
        int sumeven=0;
        int place=1;
        int r = 0;
        while(n != 0){
            r = n%10;
          if(place%2 == 0){
                sumeven += r;
            }
            else{
                sumodd += r;
            }

            n = n/10;
            place++;
        }

        System.out.println(sumeven);
        System.out.println(sumodd);
    }
}

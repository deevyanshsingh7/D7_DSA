/*
1
2 3
4 5 6
7 8 9 10
 */
import java.util.*;
public class pat13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arrange=1;
        int print=1;

        for(int rows=1;rows<=n;rows++){
            for(int i=1;i<=arrange;i++){
                System.out.print(print+"\t");
                print++;
            }

            arrange++;
            System.out.println();
        }

    }
}

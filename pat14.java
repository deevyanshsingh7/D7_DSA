/*
                       1           1
                       1 2       2 1  
                       1 2 3   3 2 1
                       1 2 3 4 3 2 1
 */
import java.util.*;
public class pat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int narrbf=1;
        int narraf=1;
        int space=(2*n)-3;
        int print1=1;
        int print2=0;
    
        for(int row=1;row<=n;row++){
            if(row == n){
                print2=row-1;
            }
            else{
            print2=row;}
            for(int i=1;i<=narrbf;i++){
                if(print1<=row){
                System.out.print(print1+"\t");
                print1++;}
            }
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=narraf;k++){  
                
                System.out.print(print2+"\t");
                print2--;
            }

            if(row < n-1){
                narrbf++;
                narraf++;
                space-=2;
            }

            else{
                narrbf = (2*(n))-1;
                space=0;
                narraf=n-1;

            }
            System.out.println();
            print1=1;
    
        }

    }
}

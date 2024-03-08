 /*
    *****
   *   *
  *   *
 *   *
*****
 
*/

import java.util.Scanner;

public class pathr {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int spbfr=n-1;
        int strbfr=n;
        
        int sp=n-2;
        int straftr=0;

       
        for(int row=1;row<=n;row++){
            for(int spb=1;spb<=spbfr;spb++){
                System.out.print(" ");
            }
            for(int j=1;j<=strbfr;j++){
                System.out.print("*"); 
            }

            for(int k=1;k<=sp;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=straftr;j++){
                System.out.print("*");;
            }
            if(row==n-1){
                strbfr=n;
                sp=0;
                straftr=0;
            }
            else{
                straftr=1;
                strbfr=1;
                sp=n-2;
            }
            spbfr--;
            System.out.println();
        }
        }
    }

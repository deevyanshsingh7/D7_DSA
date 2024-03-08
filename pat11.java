import java.util.*;
/*
 
      *
   *  *  *  
*  *  *  *  *  
   *  *  *
      *
 */


 class pat11{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int n = sc.nextInt();
        int sp= n-(n-(n/2));
        int str= n-(n-1);
        if((n>=1 && n<=10) && n%2!=0 ){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=sp;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=str;k++){
                    System.out.print("*");
                }

                if(i<=(n/2)){
                    sp--;
                    str+=2;
                }
                else{
                    sp++;
                    str-=2;
                }

                System.out.println();
            }
        }

    }
 }
/*
                            1 
                        2 1   1 2 
                    3 2 1       1 2 3 
                4 3 2 1           1 2 3 4 
                    3 2 1       1 2 3 
                        2 1   1 2 
                            1 
 */

import java.util.Scanner;

public class pat12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int spbfr=6;
        int stbfr=n-(n-1);
        int spsftr=-1;
        int staft=0;
        int topr=1;
        int temp=1;
        for(int row=1;row<=n;row++){
            if(row<=(n/2)+1){
                temp=row;
            }
            else if(row<n-1){ // 6th 
                temp=(row/2)+1;}
            else if(row==n-1){
                temp=(row/2)-1;}
            else if(row==n){
                temp=1;
            }
           
            
            
         
            for(int j=1;j<=spbfr;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=stbfr;k++){
               
                System.out.print(temp);
                temp--;
            }

            for(int l=1;l<=spsftr;l++){
                System.out.print(" ");
            }

            for(int m=1;m<=staft;m++){
                if(row!=1){
                System.out.print(topr);}
                topr++;
                
            }

            if(row<=(n/2)){
                spbfr-=2;
                stbfr++;
                spsftr+=2;
                if(row==1){
                    staft+=2;
                }
                else if(row>1){
                    staft++;
                }
                
            }
            else{
                spbfr+=2;
                stbfr--;
                spsftr-=2;
                if(row == n-1){
                    staft=0;
                }
                else{
                    staft--;
                }
               
            }
        
            System.out.println();
            topr=1;
        }

    }
}

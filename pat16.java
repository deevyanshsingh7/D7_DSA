/*
                         1
                       2 3 2
                     3 4 5 4 3
                       2 3 2
                         1
 */

import java.util.Scanner;

public class pat16 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int str=1;
        int spbf=n-1;
        int print=0;
        for(int row=1;row<=(2*n)-1;row++){
            if(row<=n){
                print=row;
            }
            
            else if(row>n){
                print=row/2;
            }
         
            
            else {
                print=1;
            }
            
            for(int i=1;i<=spbf;i++){
                System.out.print("\t");
            }
            for(int k=1;k<=str;k++){
                if(k==1 || k==str){
                    if(row<=n){
                        print=row;}
                    
                    else if(row>n){
                        if(row==n){ 
                            print=1;
                        }
                        else{
                        print=row/2;}

                    }
                   
                System.out.print(print+"\t");}
                else{
                    if(print<row+2){
                        print++;}
                    else{
                        print--;
                        
                    }
                System.out.print(print+"\t");
                }
            }

            if(row<n){
                spbf--;
                str+=2;
            }
            else{
                spbf++;
                str-=2;
            }
            System.out.println();
        }

    }
}

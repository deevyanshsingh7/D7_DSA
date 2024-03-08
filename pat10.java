/*
                       1   
                     2 3 2
                   3 4 5 4 3
                 4 5 6 7 6 5 4
                9 3 7 8 9 10 12 

 */
public class pat10 {
    public static void main(String[] args) {
        int row=4;
        int noprint=1;
        int printed=1;
        int sp=3;
        int temp=0;
        for(int i=1;i<=row;i++){
            for(int k=1;k<=sp;k++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=noprint;j++){
                System.out.print(printed);
                if(i<=2){
                    if(printed<=i){
                        printed++;  
                    }
                    else{
                        printed--;}
                    }
                else if(i>2){
                    if(printed<=i+1){
                        printed++; 
                       
                         
                    }
                   else{
                    printed--;
                   }
                        
                }

            }
            noprint+=2;
            sp--;
            System.out.println();
        }
    }
}
 
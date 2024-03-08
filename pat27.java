public class pat27 {
    public static void main(String[] args) {
        int sp=4;
        int place=1;
        int npinrw=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=place;k++){
                System.out.print(" "+npinrw);
                if(npinrw < i){
                npinrw++;
               
            }
                else{
                    npinrw--;
                }
                

            }
            for(int l=1;l<=sp;l++){
                System.out.print("  ");
            }
            System.out.println();
            sp--;
            place+=2; 
            npinrw=1;
        }
        
    }
}



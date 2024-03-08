public class patmagic {
    public static void main(String[] args) {
        int n=9;
        int strbfr=9;
        int space=0;
        int straftr=0;
        for(int row=1;row<=n;row++){
            
            for(int i=1;i<=strbfr;i++){
                System.out.print("*");
            }
           
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }

        
            for(int k=1;k<=straftr;k++){
                System.out.print("*");
                }
          
            if(row==1){
                strbfr=4;
                straftr=4;
                space++;
            }

            else if(row>1 && row<=4){
                strbfr--;
                space+=2;
                straftr--;
            }

            else if(row>4 && row<8){
                strbfr++;
                straftr++;
                space-=2;
            }

            else if(row==8){
                strbfr=9;
                space=0;
                straftr=0;
            }

            System.out.println();
            
        }
    }
}

public class pathol {
    public static void main(String[] args) {
        int n=5;
        int strbfr=5;
        int sp=0;
        int straftr=0;

        for(int row=1;row<=n;row++){
            
            for(int i=1;i<=strbfr;i++){
                System.out.print("*");
            }

            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=straftr;k++){
                System.out.print("*");
            }
            
            if(row==1){
                strbfr=2;
                sp=1;
                straftr=2;
            }
            else if(row==2){
                straftr--;
                strbfr--;
                sp+=2;
            }
            else if(row==3){
                straftr++;
                strbfr++;
                sp-=2;
            }
            else if(row==4){
                strbfr=5;
                sp=0;
                straftr=0;
            }
            System.out.println();
        }
    }
}

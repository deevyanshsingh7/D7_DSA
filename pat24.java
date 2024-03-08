public class pat24 {
    public static void main(String[] args) {
        int sp=4;
        int nuber=1;
        int npinrw=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=nuber;k++){
                System.out.print(npinrw);
            }
            for(int l=1;l<=sp;l++){
                System.out.print(" ");
            }
            System.out.println();
            sp--;
            nuber+=2;
            npinrw++;
        }
        
    }
}

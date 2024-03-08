public class pat23 {
    
    public static void main(String[] args) {
        int sp=4;
        int star=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++){
                System.out.print("1");
            }
            for(int l=1;l<=sp;l++){
                System.out.print(" ");
            }
            System.out.println();
            sp--;
            star+=2;
        }
        
    }
}

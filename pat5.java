public class pat5 {
    public static void main(String[] args) {
        int totalstr=5;
        int totsp=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=totsp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=totalstr;k++){
                System.out.print("*");
            }
            System.out.println();
            totsp++;
            totalstr--;
        }
    }
}

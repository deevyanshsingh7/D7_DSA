public class pat4 {
    public static void main(String[] args) {
        int totsp=4;
        int totstr=1;

        for(int i=1;i<=5;i++){  // loop for printing rows
            for(int j=1;j<=totsp;j++){ // loop for printing spaces
                System.out.print(" ");
                }
            for(int k=1;k<=totstr;k++){ // loop for printing stars
                System.out.print("*");
            }
            totstr++;
            totsp--;
            System.out.println();
        }
    }
}

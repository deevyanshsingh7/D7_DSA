public class pat3 {
    public static void main(String[] args) {
        int totalstr=5;
        for(int i=1;i<=5;i++){  // for printing rows
          
            for(int j=1;j<=totalstr;j++){  // for printing what we need to fill in each row basically columns
                System.out.print("*");
            }
            totalstr--;
            System.out.println();

        }
    }
}

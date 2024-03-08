public class pat1 {
    public static void main(String[] args) {
        int currstr=0;
        int totalstr=1;
        int currrow=1;
        int totrow=5;
        while(currrow<=totrow){
            currstr=0;
            while(currstr<totalstr){
                System.out.print("*");
                currstr++;
            }
            System.out.println();
            currrow++;
            totalstr++;
           
        }
    }
}

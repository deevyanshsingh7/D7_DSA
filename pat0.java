public class pat0{
    public static void main(String[] args) {
        int totstrinrw=5;
        int currstr=1;
        int currentrows=1;
        int totrows=5;
        while(currentrows<=totrows){
            currstr=0;
            while(currstr<=totstrinrw){
                System.out.print("*");
                currstr+=1;

            }
            System.out.println();
            currentrows+=1;
        }
    }
}
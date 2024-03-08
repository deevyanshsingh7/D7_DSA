import java.util.*;
public class pat15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                                                                                
        int arrange=1;
        int print=0;;

        for(int rows=1;rows<=n;rows++){
            print=rows;
            for(int i=1;i<=arrange;i++){
                if(rows<=n-(n-2)){
                    print=rows;
                }
                else if(i==1 || i==arrange){
                    print=rows;
                }
                else{
                    print=0;
                }
                System.out.print(print+"\t");
                
                
            }

            arrange++;
            System.out.println();
        }

    }
}


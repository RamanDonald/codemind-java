import java.util.*;
public class Pronic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=1;
        int c=0;
        while(x<=n){
            int m=x*x+1;
            if(m==n){
                c=1;
                break;
            }
            x++;
        }
        if(c==1){
            System.out.println("NO");
        }else{
              System.out.println("YES");
        }
    }
}
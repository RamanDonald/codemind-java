import java.util.*;
public class Prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
            if(i==1 || i==0){
                continue;
            }
           int flag=0;
           for(int j=2;j<=i/2;j++){
               if(i%j==0){
                   flag=1;
                   break;
               }
           }
           if(flag==0){
               System.out.println(i);
           }
        }
        
    }
}
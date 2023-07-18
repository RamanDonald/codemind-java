import java.util.*;
public class Largest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=0;
        while(n>0){
            int rem=n%10;
            if(rem>l){
                l=rem;
            }
            n=n/10;
        }
        System.out.println(l);
    }
}
import java.util.*;
public class LCM{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int c=a;
        int d=b;
        while(b%a!=0){
            int rem=b%a;
            b=a;
            a=rem;
        }
        int lcm=(c*d)/a;
        System.out.println(lcm);
    }
}
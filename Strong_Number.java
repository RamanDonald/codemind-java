import java.util.*;
public class StrongNum{
    public static int factorial(int n){
       int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+factorial(rem);
            num=num/10;
        }
       if(n==sum){
           System.out.println("The number "+n+" is a strong number");
       }
       else{
           System.out.println("The number "+n+" is not a strong number");
       }
    }
}
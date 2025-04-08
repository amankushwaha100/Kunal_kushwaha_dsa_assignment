import java.util.*;
class Main{
    public static int pow(int n, int p){
        int q = n;
        for(int i=0;i<p;i++){
            n=n*q;
        }
        return n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int temp = n;
        int count=0;
         while(n>0){
             count++;
             n/=10;
         }
         n=temp;
         int sum =0;
         while(temp>0){
             int rem = temp%10;
             sum = sum + pow(rem, count);
             temp/=10;
         }
         if(n==sum){
             System.out.print("Armstrong");
         }
         sc.close();
    }
}
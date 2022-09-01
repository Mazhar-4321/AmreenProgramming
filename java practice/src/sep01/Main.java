package sep01;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Operators,datatypes,control structure
        // print all the even numbers from 1 to n and n is taken run time-----
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
//        // loop
//        // 2%2=0,4%2=0,6%2,8,10,11%2=1
////        int count=0;
////        for(int i=1;i<=n;i++){
////            int remainder=i%2;
////            if(remainder==0){
////               // System.out.print(i+" ");
////                count++;
////            }
////        }
//        System.out.println(n/2);
        int sum=0;
        int power=0;
        int temp=n;
        while(n>0){
//            System.out.println(n+"%10="+(n%10)+"-----");
//            System.out.println(n+"/10="+(n/10));
//            sum=sum+n%10;
//            n=n/10;
            sum=sum*10+(n%10);
            n=n/10;

        }
        System.out.println(sum==temp?true:false);
        // 157=13
        // 157/10=15 && 157%10= 10)157(15
        // 167
        // sum*10+(n%10) =7
        //sum*10+(6)=76
        //sum*10+(1)=761
    }
}

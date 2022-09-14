package sep13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //factorial();
        primeNumber();
        // 1* 2* 3*4*5
        // fact=1
        // fact=fact*1; fact=1;
        // fact=fact*2;  fact=2;
        // fact=fact*3;  fact=6
        /*
// Array and How to approach a problem
        // 3! = 3*2*1
        // 4! = 4*3*2*1
        // 3!=1-3 4!=1-4 5!=1-5 n! = 1-n
        int r1=512;
        System.out.println(r1);

        // We cant use primitive datatypes
        // Solution : derived data types
        // By using Arrays
        int ar[]= {512,513,7666,8999,765};
       // System.out.println(ar);
        // traverse
        // diff between primitive and derived data types
        // traversing is of two types
        // for each loop
        int c=0;
        for(int x:ar){
            System.out.println(x+" "+c);
            c++;
        }
        System.out.println();
        // traditional loops
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }*/
        // 1 2 3 4 5
        // 1 2 3 4 5 6
        // factors=2
        // loop from 2 to n-1
        // find remainder of n with 2,3,4,5,..
        // read number
        // let ans=1
        // run the loop from 1 to n
        // update ans by i value
    }
    static void factorial(){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    static void primeNumber(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factors=2;
        for(int i=2;i<=Math.sqrt(n);i++){
            int remainder=n%i;
            if(remainder==0){
                factors=3;
                break;
            }
        }
        if(factors==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Non Prime Number");
        }
    }
}

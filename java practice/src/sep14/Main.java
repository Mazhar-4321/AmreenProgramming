package sep14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 nestedLoops();
    }

    private static void loopReverse() {
        for(int i=10;i>=1;i--){
            System.out.print(i+" ");
        }
        // 10 ------- 1
    }

    static void print1ton(){
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
    }
    static void overrideUpdateInitialize(){
        int ans=1;
        for(int i=1;i<=10;i++){
            ans=ans+i;
        }
        System.out.print(ans);
    }
    static void fibonacciSeries(){
        // 0 f1 l1 2 3 5 8 13 .....
        // n =n-1 + n-2
        System.out.println("Enter how many elements u want in fibonacci series");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println(0);
            return;
        }
        if(n==2){
            System.out.println(0+" "+1);
            return;
        }
        System.out.print(0+" "+1+" ");
        n=n-2;
        int f=0,l=1;
        while(n>0){
           int next=f+l;
            System.out.print(next+" ");
            f=l;
            l=next;
            n--;
        }
    }
    static void loopForward(){
        for(int i=1;i!=11;i++){
            System.out.print(i+" ");
        }

        // 1 ----- 10
    }
    static void nestedLoops(){
     for(int i=1;i<=5;i++){
         for(int j=1;j<=i;j++){
             System.out.print("Amreen");
         }
         System.out.println();
     }
    }
}

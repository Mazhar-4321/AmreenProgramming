package sep30;

import java.util.Scanner;

public class Main {
    // Arrays
    // Normal variable is designed to store one value only
    // Multiple values ----- > array
    public static void main(String[] args) {
        int serial_numbers[]={1,2,3};
        String names[]={"What","When","Why"};
       for(int x:serial_numbers){
           System.out.println(x);
           for(String j :names){
               System.out.println(j);
           }

       }
//        int a[]={1,2,3,4};
//        for(int x: a){
//            System.out.print(x+" ");
//        }
//        int size;
//        Scanner sc = new Scanner(System.in);
//        size=sc.nextInt();
//       int rollNumber[]=new int[size];
//        for(int i=0;i< rollNumber.length;i++){
//           rollNumber[i]=sc.nextInt();
//        }
//        for(int i=0;i< rollNumber.length;i++){
//            System.out.print(rollNumber[i]+" ");
//        }
    }
}

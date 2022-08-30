package aug30;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //controlstructure_conditional_statements();
       int num1;
       Scanner sc= new Scanner(System.in);
        //num1=sc.nextInt();
//        int remainder=num1%2;
//        if(remainder==0){
//            System.out.println("Even");
//        }else {
//            System.out.println("Odd");
//        }
//        if(num1==1){
//            System.out.println("Sunday");
//        }
//        if(num1==2){
//            System.out.println("Monday");
//        }
//        if(num1==3){
//            System.out.println("Tuesday");
//        }
//        if(num1==4){
//            System.out.println("Wednesday");
//        }
//        if(num1==5){
//            System.out.println("Thursday");
//        }
//        if(num1==6){
//            System.out.println("Friday");
//        }
//        if(num1==7){
//            System.out.println("SATurday");
//        }
//        if(num1<1||num1>7){
//            System.out.println("Nothing");
//        }
       //
//        switch(num1){
//            case 1:
//                System.out.println("Sunday");break;
//            case 2:
//                System.out.println("Monday");break;
//            case 3:
//                System.out.println("Tuesday");break;
//            case 4:
//                System.out.println("Wednesday");break;
//            case 5:
//                System.out.println("Thursday");break;
//            case 6:
//                System.out.println("Friday");break;
//                case 7:
//                System.out.println("Saturday");break;
//            default:
//                System.out.println("invalid");break;
//
//        }

        for(int i=1;i<=10;i++){
            if(i%2==0)
                continue;
        System.out.print(i+" ");
        }
        int i=1;
//        while(i<=10){
//            System.out.println(i);i++;
//        }
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=10);
    }
    static void controlstructure_conditional_statements(){
        // conditional statements
        // condition == boolean constant=false,true..., boolean variable boolean a,b,,,, relational operator ,,logical operat
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        // if,else,switch
        System.out.println("num1 is large");
        System.out.println("num2 is large");
        System.out.println("num3 is large");
//        if(num1>num2&&num1>num3){
//            System.out.println("num1 is large");
//        }else{
//            if(num2>num3){
//            System.out.println("num2 is large");}
//            else{
//                System.out.println("num3 is large");
//            }
//        }
//        int a;
//        a=sc.nextInt();
//        if(a==1){
//            System.out.println("sunday");
//        }
//        if(a==2){
//            System.out.println("monday");
//        }
//        if(a==3){
//            System.out.println("tuesday");
//        }
//        if(a==4){
//            System.out.println("wednesday");
//        }
//        if(a==5){
//            System.out.println("thursday");
//        }if(a==6){
//            System.out.println("friday");
//        }if(a==7){
//            System.out.println("saturday");
//        }if(a>7||a<1){
//            System.out.println("Invalid day");
//        }
//        switch(a){
//            case 1:
//                System.out.println("sunday");break;
//            case 2:
//                System.out.println("monday");break;
//            case 3:
//                System.out.println("tuesady");break;
//            case 4:
//                System.out.println("W");break;
//            case 5:
//                System.out.println("TH");break;
//            case 6:
//                System.out.println("Fr");break;
//            case 7:
//                System.out.println("Sa");break;
//            default:
//                System.out.println("Invalid Day");break;
//        }









        //looping statements
        //transfer statements
    }
    static void control_structure_looping_statements(){
        for(int i=1;i<=10;i++) {
            System.out.println("hi");
        }
        int i=1;
        while(i<=10){
            System.out.println("hi1");
            i++;
        }
        do{
            System.out.println("hi2");
            i--;
        }while(i>=1);
    }
    static void control_structure_transfer_statements(){
        for(int i=0;i<=10;i++){
            if(i%2==0)
            {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("break demo");
        for(int i=1;i<=10;i++){
            if(i%2==0)
            {
                break;
            }
            System.out.println(i);
        }
    }
    /*************

     */
}

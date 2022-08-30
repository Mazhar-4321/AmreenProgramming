package aug26;
public class Main {
    public static void main(String[] args) {
       //datatypes();
        operators();

    }
    static void datatypes(){
        // variable
        // 542(integral),mazhar(string),'a'(character),72.93(float),false(boolean)
        //1) integral(storing only +ve and -ve numbers without decimals) eg:1,2,-2,....(byte-1{-128-127},short-2{-32768-32767},int-4,long-8)
        //2)floating(storing only +ve and -ve numbers with/without decimals) eg:1.0,2.0,-2,1.5....(float,double)
        //3)character(storing a single character at a time ) eg:'a'(char)
        //4)boolean(true , false)(boolean)
        //syntax : datatype variableName;
        byte a=9;// it must start with aplhabet or $ or _
        short mazhar=98;//no white spaces allowed in between of an identifier
        int c=987;// only two special symbols are allowed {_,$}
        long d12345=9876576;//alphanumeric
        float e=98;
        double f=876;
        char g='k';
        boolean h=false;
        System.out.println(a+","+mazhar+","+c+","+d12345+","+e+","+f+","+g+","+h);
    }
    static void operators(){
        // symbols which performs operation like addition ,subtraction ......
        //arithmetic(+,-,*,/,%) // operands=2,output=constant(int,float)
        // in arithmetic operator ans will not be float until one of the operands is float
        int a=1,b=2;
        float c=9.0f;
        System.out.println(a+b+c);//12.0 /// 1+2=3,1+7.5=8.5
        System.out.println((20/35)+","+(3/2)+","+(20%35)+","+(3/2));// / quotient % remainder // 3/2
        System.out.println(3.0/2);
        //assignment(=)
        //relational(<,<=,>,>=,==,!=) false/true
        System.out.println((1<2)+","+(1>2)+","+(1==2)+","+(1!=2));
        //logical(&,&&,|,||)  false/true
        int amreen=5,mazhar=7,azhar=8;
        System.out.println(amreen>mazhar||amreen>azhar);
        System.out.println(mazhar>amreen||mazhar>azhar);
        System.out.println(azhar>amreen||azhar>mazhar);
        //bitwise(&,|,<<,>>)
        //conditional(?:)
        int a1=2,a2=599,a3=6,a4=9,a5=90;
        System.out.println((a1>a2&&a1>a3&&a1>a4&&a1>a5)?"a1 is true":(a2>a3&&a2>a4&&a2>a5?"a2 is large":(a3>a4&&a3>a5?"a3 is large":(a4>a5?"a4 is large":"a5 is large"))));
    }
}

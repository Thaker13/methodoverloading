package staticnonstatic;

public class MethodOverloading {

    static int myMethod(int a,int b){
        return a+b;

    }
    static double myMethod (double p, double q){
        return p+q;


    }
    public static void main (String[]args) {
        int digit = myMethod(int a =5,int b=10);
        double value =myMethod(int p=5.5, int q=10.5);
        System.out.println(+ digit);
        System.out.println(+ value);

    }

}


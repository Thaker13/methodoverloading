package staticnonstatic;

public class StaticNonstatic {

    void myMethod (){
        System.out.println("nonstatic method");
    }
    static void myMethod (int i){
        System.out.println("static Method");
    }

    public static void main (String[] args) {
        StaticNonstatic OBJ = new StaticNonstatic();
        int i = 10;
        OBJ.myMethod(i:10);

    }


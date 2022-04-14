package method;

public class Method_overloading {
    public static void main(String[] args) {
        byte a=10,b=50;
        System.out.println(isequal(a,b));
    }

//    public static boolean isequal(byte a,byte b) {
//        System.out.println("byte");
//        return a==b;
//    }

    public static boolean isequal(short a, short b) {
        System.out.println("short");
        return a==b;
    }

    public static boolean isequal(long a,long b) {
        System.out.println("long");
        return a==b;
    }

    public static boolean isequal(int a,int b) {
        System.out.println("int");
        return a==b;
    }
}

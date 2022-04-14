package system;

public class systemDemo {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            System.out.println(i);
        }
        long e=System.currentTimeMillis();
        System.out.println(e-s);
    }
}

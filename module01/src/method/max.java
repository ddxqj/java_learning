package method;

public class max {
    public static void main(String[] args) {
        int a = 20,b=50;
        int max = max(a,b);
        System.out.println(max);
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }
}

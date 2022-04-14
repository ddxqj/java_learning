package 泛型;

public class 可变参数 {
    public static void main(String[] args) {
        System.out.println(sum(10,1,2,3));
    }
    public static int sum(int b,int... a){
        int sum = b;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}

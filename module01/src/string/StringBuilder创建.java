package string;

public class StringBuilder创建 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);
        System.out.println(sb1.length());

        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println(sb2);
        System.out.println(sb2.length());
    }
}

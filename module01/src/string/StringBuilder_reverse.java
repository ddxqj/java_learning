package string;

public class StringBuilder_reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.reverse().reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}

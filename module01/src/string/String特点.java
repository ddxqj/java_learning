package string;

public class String特点 {
    public static void main(String[] args) {
        char[] chs = {'a','b','c'};
        String s1 = new String(chs);
        String s2 = new String(chs);
        System.out.println(s1==s2);

        String s3 ="";
        String s4 ="";
        System.out.println(s3==s4);

    }
}

package string;

public class String_StringBuilder {
    public static void main(String[] args) {
        //String-->StringBuilder
        String s1 = "hello";
        StringBuilder sb = new StringBuilder(s1);

        //StringBuilder-->String
        String s2 = sb.toString();
    }
}

package string;

import java.util.Arrays;

public class StringBuilder_append {
    public static void main(String[] args) {
        char[] chs = {'a','b','c'};
//        byte[] bys = {97,98,99};
        StringBuilder sb = new StringBuilder();
        sb.append(100).append("hello").append(100.65).append(chs);
        System.out.println(sb);
    }
}

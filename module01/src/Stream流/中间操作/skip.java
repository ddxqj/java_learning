package Stream流.中间操作;

import java.util.ArrayList;

public class skip {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("liubei");
        list.add("liubiao");
        list.add("zhangfei");
        list.add("guanyu");
        list.add("zhaoyun");

        list.stream().skip(6).forEach(System.out::println);
    }
}

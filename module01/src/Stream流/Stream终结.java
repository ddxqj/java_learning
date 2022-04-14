package Stream流;

import java.util.ArrayList;

public class Stream终结 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("liubei");
        list.add("liubiao");
        list.add("zhangfei");
        list.add("guanyu");
        list.add("zhaoyun");

        long count = list.stream().count();
        System.out.println(count);

        list.stream().forEach(s-> System.out.println(s));
    }
}

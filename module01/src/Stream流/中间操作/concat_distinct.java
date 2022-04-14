package Stream流.中间操作;

import java.util.ArrayList;
import java.util.stream.Stream;

public class concat_distinct {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("liubei");
        list.add("liubiao");
        list.add("zhangfei");
        list.add("guanyu");
        list.add("zhaoyun");

        Stream<String> s1 =list.stream().limit(4);
        Stream<String> s2=list.stream().skip(2);
        Stream.concat(s1,s2).distinct().forEach(System.out::println);

    }
}

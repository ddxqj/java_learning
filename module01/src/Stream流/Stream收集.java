package Stream流;

import java.util.*;
import java.util.stream.Collectors;

public class Stream收集 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("liubei");
        list.add("liubiao");
        list.add("zhangfei");
        list.add("guanyu");
        list.add("zhaoyun");
        List<String> name=list.stream().filter(s->s.length()==6).collect(Collectors.toList());
        System.out.println(name);

        Set<Integer> set = new HashSet<>();
        set.add(50);
        set.add(30);
        set.add(60);
        set.add(40);
        set.add(20);
        Set<Integer> collect = set.stream().filter(s->s>40).collect(Collectors.toSet());
        System.out.println(collect);

        Map<Integer,Integer> map = set.stream().filter(s -> s > 20).collect(Collectors.toMap(s->s,s->s*10));
        System.out.println(map);

    }
}

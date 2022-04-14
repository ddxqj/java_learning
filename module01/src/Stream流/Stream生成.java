package Stream流;

import java.util.*;
import java.util.stream.Stream;

public class Stream生成 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> liststream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> setstream = set.stream();

        Map<String, Integer> map = new HashMap<>();
        Stream<String> mapkeystream = map.keySet().stream();
        Stream<Integer> mapvaluestream = map.values().stream();

        String[] strarr={"hello","world","java"};
        Stream<String> arrStream = Stream.of(strarr);
        Stream<String> arrStream1 = Stream.of("hello","world","java");
        Stream<Integer> arrStream2 = Stream.of(1,2,3);
    }
}

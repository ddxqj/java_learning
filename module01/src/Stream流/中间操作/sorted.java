package Stream流.中间操作;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class sorted {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("liubei");
        list.add("liubiao");
        list.add("zhangfei");
        list.add("guanyu");
        list.add("zhaoyun");
        list.stream().sorted().forEach(System.out::println);


        list.stream().sorted( (x,y)-> {
                int num =x.length()-y.length();
                int num1= num==0?x.compareTo(y):num;
                return num1;
        }).forEach(System.out::println);

    }
}

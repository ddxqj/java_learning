package Stream流.中间操作;

import java.util.ArrayList;

public class mapToInt {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("100");
        list.add("102");
        list.add("98");
        list.add("36");
        list.add("200");

        list.stream().mapToInt(Integer::parseInt).forEach(System.out::println);
        int sum =list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}

package Stream流.中间操作;

import java.util.ArrayList;

public class map {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("100");
        list.add("102");
        list.add("98");
        list.add("36");
        list.add("200");

        list.stream().map(Integer::parseInt).forEach(System.out::println);
    }
}

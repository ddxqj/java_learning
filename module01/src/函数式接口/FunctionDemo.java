package 函数式接口;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        convert( "1024", s->Integer.parseInt(s),i->String.valueOf(i+100) );
    }
    private static void convert(String s , Function<String,Integer> f1,Function<Integer,String> f2){
//        int i = f1.apply(s);
//        String ss = f2.apply(i+100);
        String ss = f1.andThen(f2).apply(s);
        System.out.println(ss);
    }
}

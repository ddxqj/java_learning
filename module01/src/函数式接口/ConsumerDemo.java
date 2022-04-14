package 函数式接口;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        operatorString("niubi", (s -> System.out.println(s)) );

        operatorString("qwertyui", (s -> System.out.println(s)),
                s -> System.out.println(new StringBuilder(s).reverse().toString()) );
    }
    private static void operatorString(String name, Consumer<String> con){
        con.accept(name);
    }
    private static void operatorString(String name, Consumer<String> con1,Consumer<String> con2){
        con1.andThen(con2).accept(name);
        //相当于  con1.accept(name); con2.accept(name);
    }
}

package 函数式接口;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        boolean b1 =checkStringNegate("niubi", s-> s.length()<8);
        System.out.println(b1);
    }
    private static boolean checkString(String s,Predicate<String> p){
        return p.test(s);
    }
    private static boolean checkStringAnd(String s,Predicate<String> p,Predicate<String> p1){
        return p.and(p1).test(s);
    }
    private static boolean checkStringOr(String s,Predicate<String> p,Predicate<String> p1){
        return p.or(p1).test(s);
    }
    private static boolean checkStringNegate(String s,Predicate<String> p){
        return p.negate().test(s);
    }
}

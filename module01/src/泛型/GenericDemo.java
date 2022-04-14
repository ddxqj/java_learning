package 泛型;

public class GenericDemo {
    public static void main(String[] args) {
        Generic<String,Integer> g = new Generic<>();
        g.setT("hello");
        System.out.println(g.getT());
        g.show(3.14);

        Generic<Character,Float> ge = new Generic<>();
        ge.setT('1');
        System.out.println(ge.getT());

        GenericInter<String> gi=new GenericInterImp<>();
        gi.show("world");
    }
}

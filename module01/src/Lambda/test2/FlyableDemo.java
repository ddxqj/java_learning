package Lambda.test2;

public class FlyableDemo {
    public static void main(String[] args) {
        useFlyable( (s,ss)-> System.out.println(s+ss));
        //useFlyable(System.out::println);
    }
    public static void useFlyable(Flyable f){
        f.fly("风和日丽","晴空万里");
    }
}

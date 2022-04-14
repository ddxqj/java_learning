package Lambda.test1;

public class EatableDemo {
    public static void main(String[] args) {
       useEatable(()-> System.out.println("吃吃吃吃吃"));

    }
    private static void useEatable(Eatable e){
        e.eat();
    }
}

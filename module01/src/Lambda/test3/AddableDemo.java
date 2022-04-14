package Lambda.test3;

public class AddableDemo {
    public static void main(String[] args) {
        useAdd( (x,y)-> x+y);
    }
    public static void useAdd(Addable a){
        int sum =a.add(1,2);
        System.out.println(sum);
    }
}

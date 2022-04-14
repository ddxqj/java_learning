package 接口;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping a =new cat();
        a.jump();

        System.out.println(Jumpping.num1);
        System.out.println(a.num2);
        //cat.num1=20;
        //cat.num2=30;


        animal b=new cat("美国猫",20);
        b.eat();
    }
}

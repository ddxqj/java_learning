package 接口;

public class cat extends animal implements Jumpping {
    public cat() {
    }

    public cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃东西");
    }

    @Override
    public void jump() {
        System.out.println("猫跳高");
    }
}

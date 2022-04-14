package 多态.转型;

public class cat extends animal{
    @Override
    public void eat() {
        System.out.println("猫吃东西");
    }
    public void play(){
        System.out.println("猫在玩耍");
    }
}

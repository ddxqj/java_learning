package 多态;

public class cat extends animal{
    public int age=20;
    @Override
    public void eat() {
        System.out.println("猫吃东西");
    }
    public void play(){
        System.out.println("猫在玩耍");
    }

}

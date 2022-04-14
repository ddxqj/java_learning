package 抽象类;

public class cat extends animal{
    public cat(){
        System.out.println("产生了一只猫");
    }
    public cat(String name,int age){
        super(name, age);
        System.out.println("产生了一只有名字和年龄的猫");
    }

    @Override
    public void eat() {
        System.out.println("猫吃东西");
    }
}

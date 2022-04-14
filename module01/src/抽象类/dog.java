package 抽象类;

public class dog extends animal{
    public dog() {
        System.out.println("产生了一只狗");
    }
    public dog(String name,int age){

        super(name,age);
        System.out.println("产生了一只有名字和年龄的狗");
    }


    @Override
    public void eat() {
        System.out.println("狗吃东西");
    }
}

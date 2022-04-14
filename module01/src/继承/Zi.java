package 继承;

public class Zi extends F {
    public Zi(){
        //这里实际上有个super();
        System.out.println("Zi无参构造");
    }
    public Zi(int age){
        //这里实际上有个super();
        System.out.println("Zi有参构造");
    }
    public int age = 30;
    public void set_show_age(){
        int age=20;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Zi中show方法调用");
    }
}

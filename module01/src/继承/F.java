package 继承;

public class F {
    public F(){
        System.out.println("F无参构造");
    }
    public F(int age){
        System.out.println("F有参构造");
    }
    public int age =40;
    public void show(){
        System.out.println("F中show方法调用");
    }
}

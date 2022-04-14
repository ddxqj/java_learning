package 内部类;

public class Outer {
    private int num =10;
    private class Inner1{//设为private，使外界无法直接创建，只能使用method方法
        public void show(){
            System.out.println(num);
        }
    }
    public void method1(){
        Inner1 i=new Inner1();
        i.show();
    }
    public void method2(){
        int num1=20;
        class Inner2{
            public void show(){
                System.out.println(num1);
            }
        }
        Inner2 i =new Inner2();
        i.show();
    }
}

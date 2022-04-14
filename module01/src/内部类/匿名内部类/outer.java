package 内部类.匿名内部类;

public class outer {

    public void method(){
        inter i=new inter(){
            public void show(){
                System.out.println("...");
            }
        };
        i.show();
    }
}

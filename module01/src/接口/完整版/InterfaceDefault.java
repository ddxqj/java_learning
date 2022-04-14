package 接口.完整版;

public interface InterfaceDefault {
    void show1();
    default void show2(){
        System.out.println("show2");
    }
}

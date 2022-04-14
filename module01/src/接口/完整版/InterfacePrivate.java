package 接口.完整版;

public interface InterfacePrivate {
    void show();

    private void show1() {
        System.out.println("caocao");
        System.out.println("liubei");
        System.out.println("sunquan");
    }

    default void show2(){
        show1();
        show3();
        show4();
    }

    private static void show3(){
        System.out.println("caocao");
        System.out.println("liubei");
        System.out.println("sunquan");

    }
    static void show4(){
        show3();

    }

}

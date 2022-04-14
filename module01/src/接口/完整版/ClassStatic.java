package 接口.完整版;

public class ClassStatic implements InterfaceStatic{
    public static void main(String[] args) {
        InterfaceStatic c = new ClassStatic();
        c.show();
        InterfaceStatic.show1();
    }
    @Override
    public void show() {
        System.out.println("show");
    }

}

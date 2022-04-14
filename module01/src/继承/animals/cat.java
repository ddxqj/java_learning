package 继承.animals;

public class cat extends animal{
    public cat() {
    }

    public cat(String name, int age) {
        super(name, age);
    }
    public void catchMouse(){
        System.out.println("猫捉老鼠");
    }
}

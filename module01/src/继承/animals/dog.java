package 继承.animals;

public class dog extends animal{
    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }

    public void watchdoor(){
        System.out.println("看门");
    }
}

package 抽象类;

public abstract class animal {
    private String name;
    private int age;
    public animal() {
        System.out.println("产生了一个动物");
    }
    public animal(String name,int age){
        this.age=age;
        this.name=name;
        System.out.println("产生了一个有名字和年龄的动物");
    }
    public void show(){
        System.out.println(name+","+age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();
}

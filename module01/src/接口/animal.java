package 接口;

public abstract class animal {
    private String name;
    private int age;

    public animal() {
    }

    public animal(String name,int age) {
        this.age = age;
        this.name=name;
    }
    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

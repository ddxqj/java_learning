package 多态;

public class animalDemo {
    public static void main(String[] args) {
        animal cat=new cat();
        cat.eat();//成员方法，编译看animal，执行看cat
        System.out.println(cat.age);//成员变量，编译看animal，执行看animal

        animalOperator ao=new animalOperator();
        cat c=new cat();
        ao.useAnimal(c);//animal it=new cat();
        dog d=new dog();
        ao.useAnimal(d);//animal it=new dog();
    }
}

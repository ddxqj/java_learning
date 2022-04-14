package 多态.转型;

public class animalDemo {
    public static void main(String[] args) {
        animal a = new cat();//向上转型，从子到父，父类引用指向子类对象
        a.eat();
        //a.play();

        cat c=(cat)a;//向下转型，从父到子，父类引用转为子类对象
        c.eat();
        c.play();
    }
}

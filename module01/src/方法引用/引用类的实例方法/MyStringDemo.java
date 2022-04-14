package 方法引用.引用类的实例方法;

public class MyStringDemo {
    public static void main(String[] args) {
        useMyString( String::substring );
        //第一个参数作为调用者，后面的参数全部传递给该方法作为参数
    }
    public static void useMyString(MyString my){
        String s =my.mySubString("asdfghjkl",1,5);
        System.out.println(s);
    }
}

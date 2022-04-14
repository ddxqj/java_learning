package 方法引用.引用类方法;

public class ConverterDemo {
    public static void main(String[] args) {
        useConverter(Integer::parseInt);
    }
    public static void useConverter(Converter c){
        int i =c.convert("1024");
        System.out.println(i);
    }
}

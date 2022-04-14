package 方法引用;

public class PrintableDemo {
    public static void main(String[] args) {
        usePrintable( i-> System.out.println(i) );
        usePrintable(System.out::println);
    }
    public static void usePrintable(Printable p){
        p.printInt(10);
    }
}

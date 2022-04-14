package 方法引用.引用对象的实例方法;

public class PrinterDemo {
    public static void main(String[] args) {
        PrintString ps = new PrintString();
        usePrinter( ps::printUpper );
    }
    public static void usePrinter(Printer p){
        p.printUpperCase("dasdada","dajifowjfqo");
    }
}

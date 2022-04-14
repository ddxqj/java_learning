package method;

public class IsEvenNumber {
    public static void main(String[] args) {
        int a = 11;
        System.out.println("数字是否是偶数？"+isevennumber(a));
    }

    public static boolean isevennumber(int a) {
        return a%2==0;
    }
}

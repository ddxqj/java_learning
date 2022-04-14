package string;

public class String创建 {
    public static void main(String[] args) {
        char[] chs = {'a','b','c'};
        byte[] bys = {97,98,99};
        String s1 = new String();
        System.out.println("s1:"+s1);
        String s2 = new String(chs);
        System.out.println("s2:"+s2);
        String s3 = new String(bys);
        System.out.println("s3:"+s3);
        String s4 = "abc";
        System.out.println("s4:"+s4);
    }
}

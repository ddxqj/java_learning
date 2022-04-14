package Integer例子;

public class IntegerDemo {
    public static void main(String[] args) {
        Integer i1=new Integer(100);
        System.out.println(i1);

        Integer i2=new Integer("200");
        //  Integer i2=new Integer("abc");  //报错
        System.out.println(i2);

        Integer i3=Integer.valueOf(300);
        System.out.println(i3);

        Integer i4=Integer.valueOf("400");
        //  Integer i4=Integer.valueOf("abc");  //报错
        System.out.println(i4);
    }
}

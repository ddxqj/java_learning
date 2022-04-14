package Integer例子;

public class int和string转换 {
    public static void main(String[] args) {
        int n =100;
        String s1=""+n;
        System.out.println(s1);

        String s2=String.valueOf(n);
        System.out.println(s2);

        String s3= "200";
        Integer i1= Integer.valueOf(s3);
        int m=i1.intValue();
        System.out.println(m);

        int l=Integer.parseInt(s3);
        System.out.println(l);
    }
}

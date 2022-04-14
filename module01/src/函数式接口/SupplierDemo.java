package 函数式接口;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        String s =getString( ()-> "liubei" );
        System.out.println(s);

        int[] a ={28,14,56,99};
        int m =getMax( ()->{
            int max =a[0];
            for (int i = 1; i < a.length; i++) {
                if(a[i]>max) max=a[i];
            }
            return max;
        });
        System.out.println(m);
    }
    private static String getString(Supplier<String> sup){
        return sup.get();
    }
    private static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}

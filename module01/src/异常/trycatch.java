package 异常;

public class trycatch {
    public static void main(String[] args) {
        System.out.println("开始");
        methods();
        System.out.println("结束");

    }

    private static void methods() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);

        } catch (ArrayIndexOutOfBoundsException e){
            e.getMessage();
            e.toString();
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println("数组越界");
        }
    }

}

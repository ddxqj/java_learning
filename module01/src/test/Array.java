package test;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[3]; //动态初始化
        int[] array1 = {0, 0, 0}; //静态初始化
        int[] array2 = array1;
        array2[0] = 50;System.out.println(array1[0]);//修改array2的值，array1的值发生变化

    }
}

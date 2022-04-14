package Arraylist;

import java.util.ArrayList;

public class ArrayList常用方法 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("bei");
        arrayList.add("jing");
        arrayList.add("huan");
        arrayList.add("ying");
        arrayList.add("bei");

        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.set(0,"ni"));//返回被修改的值
        System.out.println(arrayList.remove("bei"));//返回true
        System.out.println(arrayList.remove(0));//返回被删除的值
        System.out.println(arrayList.size());
        System.out.println(arrayList);
    }
}

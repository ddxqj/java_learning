package test;

import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String s1 = sc.nextLine();
        int number = sc.nextInt();
        //String s2 = sc.next();


        System.out.println("---"+number+"---");
        System.out.println("---"+s1+"---");
        //System.out.println("---"+s2+"---");
    }
}

package test;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int guessnumber = sc.nextInt();
            if (guessnumber > number) {
                System.out.println("你猜的数字大了");
            } else if (guessnumber < number) {
                System.out.println("你猜的数字小了");
            } else {
                System.out.println("你猜中了！");
                break;
            }
        }
    }
}

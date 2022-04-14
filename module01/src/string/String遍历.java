package string;

import java.util.Scanner;

public class String遍历 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nextLine = sc.nextLine();
        for(int i =0;i<nextLine.length();i++){
            System.out.println(nextLine.charAt(i));
        }
    }
}

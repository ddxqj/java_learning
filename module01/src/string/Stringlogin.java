package string;

import java.util.Scanner;

public class Stringlogin {
    public static void main(String[] args) {
        String username = "tao";
        String password = "tao";

        for(int i=0;i<3;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String pwd = sc.nextLine();
            if(!name.equals(username)){
                System.out.println("您输入的用户名不存在");
            }
            else if(!password.equals(pwd)){
                System.out.println("您输入的密码有误");
            }
            else{
                System.out.println("登录成功！");
                break;
            }
        }
    }
}

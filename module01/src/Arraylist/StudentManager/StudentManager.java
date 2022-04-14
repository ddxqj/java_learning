package Arraylist.StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.print("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    System.out.println("1 添加学生");
                    addStudent(arrayList);
                    break;
                case "2":
                    System.out.println("2 删除学生");
                    removeStudent(arrayList);
                    break;
                case "3":
                    System.out.println("3 修改学生");
                    updateStudent(arrayList);
                    break;
                case "4":
                    System.out.println("4 查看学生");
                    findAllStudent(arrayList);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    //return;
                    System.exit(0);
                default:
                    System.out.println("输入错误，请重输！");
                    break;
            }
        }
    }

    public static void addStudent(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while(true){
            System.out.print("请输入学生的学号：");
            sid = sc.nextLine();
            boolean flag=true;
            for (int i = 0; i < arrayList.size(); i++) {
                if (sid.equals(arrayList.get(i).getSid())) {
                    System.out.println("学号已存在，添加失败！");
                    flag=false;
                    break;
                }
            }
            if(flag) break;
        }
        System.out.print("请输入学生的姓名：");
        String name = sc.nextLine();
        System.out.print("请输入学生的年龄：");
        int age = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.print("请输入学生的地址：");
        String address = sc.nextLine();

        Student s = new Student(sid, name, age, address);

        arrayList.add(s);
        System.out.println("添加成功!");
    }

    public static void removeStudent(ArrayList<Student> arrayList) {
        if (arrayList.size() == 0) {
            System.out.println("系统中没有学生！");
            return;
        }
        System.out.print("请输入要删除的学生的学号：");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        for (int i = 0; i < arrayList.size(); i++) {
            if (sid.equals(arrayList.get(i).getSid())) {
                arrayList.remove(i);
                System.out.println("删除学生成功！");
                return;
            }
        }
        System.out.println("删除学生学号不存在！");

    }

    public static void updateStudent(ArrayList<Student> arrayList){
        if (arrayList.size() == 0) {
            System.out.println("系统中没有学生！");
            return;
        }
        System.out.println("请输入要修改的学生的学号：");
        Scanner sc =new Scanner(System.in);
        String sid =sc.nextLine();
        for(int i=0;i<arrayList.size();i++){
            if(sid.equals(arrayList.get(i).getSid())){
                System.out.println("请输入新的姓名：");
                String name= sc.nextLine();
                System.out.println("请输入新的地址：");
                String address= sc.nextLine();
                System.out.println("请输入新的年龄：");
                int age =sc.nextInt();
                Student s =new Student(sid,name,age,address);
                arrayList.set(i,s);
                System.out.println("修改完成！");
                return;
            }
        }
        System.out.println("输入的学号不存在！");
    }

    public static void findAllStudent(ArrayList<Student> arrayList) {
        if (arrayList.size() == 0) {
            System.out.println("系统中没有学生！");
            return;
        }
        System.out.println("学号\t\t姓名\t\t年龄\t\t居住地");
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "岁\t\t" + s.getAddress());
        }
    }

}

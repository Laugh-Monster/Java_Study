package encapsulationexer.exer3;

import java.util.Scanner;

/**
 * @ClassName:EmployeeTest
 * @Description
 * @Author Laugh_Monster
 * @Date 2024/9/24
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入公司人数");
        int num = scan.nextInt();
        Employee[] emp = new Employee[num];
        for (int i = 0; i < emp.length; i++) {
            emp[i] = new Employee();
            System.out.println("----------添加第"+ (i + 1) + "个员工----------");
            System.out.print("姓名：");
            String name = scan.next();
            emp[i].setName(name);

            System.out.print("性别：");
            char gender = scan.next().charAt(0);
            emp[i].setGender(gender);

            System.out.print("年龄：");
            int age = scan.nextInt();
            emp[i].setAge(age);

            System.out.print("电话：");
            String phoneNumber = scan.next();
            emp[i].setPhoneNumber(phoneNumber);
        }
        System.out.println("----------员工列表----------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话");
        for (int i = 0; i < emp.length; i++) {
            System.out.print(i + 1 + "\t");
            System.out.println(emp[i].showInfo());
        }

    }
}

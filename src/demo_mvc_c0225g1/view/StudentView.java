package demo_mvc_c0225g1.view;

import demo_mvc_c0225g1.controller.StudentController;
import demo_mvc_c0225g1.entity.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    public static void showList(List<Student> studentList){
        for (int i = 0; i <studentList.size() ; i++) {
            System.out.println((i+1)+ "."+ studentList.get(i));
        }
    }

    public static Student inputStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã:");
        long code = Long.parseLong(scanner.nextLine());

        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        System.out.print("Nhập điểm: ");
        int point = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên lớp: ");
        String className = scanner.nextLine();
        return  new Student(code,name,address,point,className);
    }
}

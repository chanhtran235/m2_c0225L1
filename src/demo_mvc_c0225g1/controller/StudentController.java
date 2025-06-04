package demo_mvc_c0225g1.controller;

import demo_mvc_c0225g1.entity.Student;
import demo_mvc_c0225g1.service.IStudentService;
import demo_mvc_c0225g1.service.StudentService;
import demo_mvc_c0225g1.view.StudentView;

import java.util.List;
import java.util.Scanner;

public class StudentController {
    private static IStudentService studentService = new StudentService();
    public static void displayMenuStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("Quản lý học sinh");
        System.out.println("1. Danh sách học sinh");
        System.out.println("2. Thêm mới học sinh");
        System.out.println("3. Sửa học sinh");
        System.out.println("4. Xóa học sinh");
        System.out.println("5. Quay lại menu chính");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                List<Student> studentList = studentService.findAll();
                StudentView.showList(studentList);
            case 2:
                Student student = StudentView.inputStudent();
                studentService.add(student);
                System.out.println("Thêm mới thành công");
                break;
        }
    }


}

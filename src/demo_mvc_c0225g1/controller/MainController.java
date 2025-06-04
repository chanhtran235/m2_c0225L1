package demo_mvc_c0225g1.controller;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
       displayMainMenu();
    }
    public static void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình quản lý CodeGym");
        System.out.println("1. Quản lý học sinh");
        System.out.println("2. Quản lý giáo viên");
        System.out.println("3. Quản lý nhân viên");
        System.out.print("Mời bạn nhập lựa chọn: ");
        // chọn đối tượng quản lý
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            // sinhvieen
            case 1:
                StudentController.displayMenuStudent();
                break;
            case 2:
                // teacher

        }
    }
}

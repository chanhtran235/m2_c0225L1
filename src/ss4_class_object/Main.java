package ss4_class_object;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       displayMenu();
    }
    public static void displayMenu() {
        StudentManagement studentManagement = new StudentManagement();
        final int DISPLAY =1;
        final int ADD =2;
        final int DELETE =3;
        final int SEARCH =4;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("-----Chọn chức năng-----\n" +
                    "1.Hiển thị danh sách\n" +
                    "2.Thêm mới\n" +
                    "3.Xoá\n" +
                    "4.Tìm kiếm\n" +
                    "5. Thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case DISPLAY:
                    System.out.println("Danh sách");
                    // gọi phương thức display của đối tượng StudentManagerment
                    studentManagement.display();
                    break;
                case ADD:
                    System.out.println("Thêm mới");
                    System.out.println("nhập id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhập tên");
                    String name = scanner.nextLine();
                    System.out.println("nhập địa chỉ");
                    String address = scanner.nextLine();
                    Student student = new Student(id,name,address);
                    studentManagement.add(student);
                    System.out.println("thêm mới thành công");
                    break;
                case DELETE:
                    System.out.println("Xoá");
                    break;
                case SEARCH:
                    System.out.println("Tìm kiếm");
                    break;
                default:
                    flag = false;
                    break;
            }
        }

    }
}

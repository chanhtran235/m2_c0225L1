package ss100_demo;

import ss3_method.Demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }

    public static void displayMenu() {
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
                    // chức hiển thị
                    break;
                case ADD:
                    System.out.println("Thêm mới");
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


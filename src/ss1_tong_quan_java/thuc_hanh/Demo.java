package ss1_tong_quan_java.thuc_hanh;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello C02");
        int i =1;
        float f =10.0f;
        double d = 10.0f;
        System.out.println(i=='1');

        boolean b = true;
        char c = 'c';
        Float f2 = 10.0f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("ten của bạn là: "+ name);
        System.out.println("tuổi của bạn là: "+ age);
        System.out.println("địa chỉ của bạn là: "+ address);

    }
}

package ss15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------bắt đầu chương trình");
        System.out.println("nhập index cần lấy");
//        int index;
//        try {
//            index = Integer.parseInt(scanner.nextLine());
//            System.out.println(getElement(index));
//        }catch (NumberFormatException e){
//            System.out.println(e.getMessage());
//            index =0;
//            System.out.println(getElement(index));
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//            index = 2;
//            System.out.println(getElement(index));
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            System.out.println("khối finally luôn luôn chạy");
//        }
//        try {
//            readFile("D:\\codegym\\demo 2025\\module2\\c0225L1\\src\\ss15\\student.csv1");
//        }catch (FileNotFoundException e){
//            System.out.println(e.getMessage());
//        }

        int age = Integer.parseInt(scanner.nextLine());
        try {
            System.out.println(checkAge(age));
        } catch (CheckAgeException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("-------kêt thúc chương trình");
    }

    public static int getElement(int index) {
        int[] array = {10, 20, 30};
        int element = array[index];
        return element;
    }

    public static void readFile(String pathFile) throws FileNotFoundException {
        File file = new File(pathFile);
        FileReader fileReader = new FileReader(file);
        //đọc file;
    }
    public static boolean checkAge(int age) throws CheckAgeException {
        if (age<0){
            throw  new CheckAgeException("Tuổi nhỏ hơn 0");
        } else if (age>120) {
            throw new CheckAgeException("Tuổi lớn hơn 120");
        }else {
            return true;
        }
    }
}

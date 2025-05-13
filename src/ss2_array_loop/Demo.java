package ss2_array_loop;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
     // khai báo mảng có  thể lưu dữ liệu kiểu int
        int[] numbers = {10,20,30};
        int nums[] = {20,45,56};
        String[] cars = new String[3]; // mỗi phần tử giá trị null
        cars[0]= "Huyndai";
        cars[1]= "Honda";
        cars[2]= "Toyota";

        System.out.println(Arrays.toString(cars));
        for (int i = 0; i < cars.length ; i++) {
           cars[i] = cars[i] + "VN";
        }

//        for(String car: cars){
//            car = car +"VN";
//        }

        System.out.println(Arrays.toString(cars));
        int[][] matrix1 = {
                {10,2,4},
                {34,4,5}
        };
        int[][] matrix = new  int[3][3];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                matrix[i][j] = 10;
            }
        }

        // duyệt mảng :

    }
}

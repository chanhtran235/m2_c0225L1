package ss3_method;

import java.util.Arrays;

public class DemoPassValue {
    public static void main(String[] args) {
//        int i =10;
//        changeValue(i);
//        System.out.println("giá trị ngoài method : "+ i);
//
        int[] array = {1,2};
        changeArray(array);
        System.out.println("Ngoài method:" +Arrays.toString(array));
    }

    public  static void changeValue(int a){
        a++;
        System.out.println("giá trị trong method: "+ a);
    }

    public static void changeArray(int[] arr){
        arr = new int[]{20,30};
        System.out.println("Trong method:" +Arrays.toString(arr));
    }
}

package ss11_stack_queue;

import demo_mvc_c0225g1.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        list.add(new Student());
        List<Integer> list1 = new ArrayList<>();

        list1.add(1);

        // phải ép kiểu
        System.out.println(list.get(3).getClassName());
    }
}

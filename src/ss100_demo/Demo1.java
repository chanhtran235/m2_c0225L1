package ss100_demo;

import ss4_class_object.Student;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {

        // tạo map lưu số buổi vắng nghỉ học viên
        Map<Student, Integer> hashMap = new TreeMap<>();
        hashMap.put(new Student(1,"chánh1"),1);
        hashMap.put(new Student(3,"chánh3"),3);
        hashMap.put(new Student(2,"chánh2"),2);
        hashMap.put(new Student(4,"chánh4"),4);
        hashMap.put(new Student(1,"chánh1"),100);

        Set<Student> studentSet = hashMap.keySet();
        for (Student student: studentSet) {
            System.out.println(student.getName() + ":"+hashMap.get(student));
        }
//       Set<Map.Entry<Student,Integer>> entries = hashMap.entrySet();
//
//        for (Map.Entry<Student,Integer> entry: entries) {
//            System.out.println(entry.getKey().getName() + ":"+ entry.getValue());
//        }
//        Student student1 = new Student(1,"chánh1");
//        Student student2 = new Student(1,"chánh1");
//        System.out.println(student1.equals(student2));// false




    }
}

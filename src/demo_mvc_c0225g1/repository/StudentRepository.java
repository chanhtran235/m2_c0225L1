package demo_mvc_c0225g1.repository;

import demo_mvc_c0225g1.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1,"chánh1","ĐN",9,"C02"));
        studentList.add(new Student(2,"chánh2","ĐN",9,"C02"));
    }

    @Override
    public void add(Student student) {
        // ghi file
        studentList.add(student);
    }

    @Override
    public List<Student> findAll() {
        // đọc file
        return studentList;
    }


}

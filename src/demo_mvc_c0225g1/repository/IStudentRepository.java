package demo_mvc_c0225g1.repository;

import demo_mvc_c0225g1.entity.Student;

import java.util.List;

public interface IStudentRepository {
    void add(Student student);

    List<Student> findAll();

}

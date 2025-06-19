package mvc.service;

import mvc.entity.Student;

import java.util.List;

public interface IStudentService  {
    List<Student> findAll();
    void add(Student student);
    boolean deleteById(int code);

}

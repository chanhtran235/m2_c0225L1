package ss5_static;

import java.util.Arrays;

public class Student {
    public int id;
    private String name;
    public static String school;
    public static int count =0;
    static {
        school = "BKDN";
    }

    public Student() {
        count++;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

    }

    public String getName() {
        System.out.println(school);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "school" + school+
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student(1,"chánh1");
        Student student2 = new Student(2,"chánh1");
        System.out.println(student1);
        System.out.println(student2);
        Student.setSchool("Codegym");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.getId());
        student2.id=-1;
        student2.setId(100);
    }
}

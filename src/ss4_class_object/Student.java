package ss4_class_object;

import java.util.Objects;

public class Student implements Comparable<Student> {
    // thuộc tính
   private int id; // global / instance
    private String name;
   private String address;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, String address) {
        this(id, name);
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  void study(String subject){
        System.out.println(this.name + "  đang học môn :"+ subject);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        Student student = (Student)o;
//        return this.id == student.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id-o.getId();
    }
}


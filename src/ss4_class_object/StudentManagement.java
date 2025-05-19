package ss4_class_object;

public class StudentManagement {
    private Student[] students = new Student[100];
    // có các phương thức CRUD :  Create, Read, Update, Delete
    public void display(){
        for (int i = 0; i <students.length ; i++) {
            if (students[i]!=null){
                System.out.println(students[i]);
            }

        }
    }
    public void add (Student student){
        for (int i = 0; i <students.length ; i++) {
            if (students[i]==null){
                students[i] =student;
                break;
            }
        }
    }
}

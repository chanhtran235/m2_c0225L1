package ss4_class_object;

public class StudentManagement {
    private static Student[] students = new Student[100];
    static {
        students[0]= new Student(1,"chánh1");
        students[1]= new Student(2,"chánh1");
        students[2]= new Student(3,"chánh1");
    }
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

package ss6;

import java.util.Objects;

public class Student  extends Person{
    private String className;
    public Student(){
//        System.out.println("con khởi tạo");
    }



    public Student(int id, String name, String address,String className){
        super(id, name, address);
        this.className = name;

    }

    public void study(String subject){
        System.out.println("đang học môn" + subject);
    }

    @Override
    public void howToGo(){
        System.out.println("sinh vien di hoc bang oto");
    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student)o;
       return super.getId()==student.getId();
    }

        @Override
    public String toString() {

        return "SV "+super.toString() + className;
    }

}

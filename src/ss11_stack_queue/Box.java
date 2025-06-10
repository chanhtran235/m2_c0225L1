package ss11_stack_queue;

import demo_mvc_c0225g1.entity.Student;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Box <T>{
    private  T t;

    public Box() {

    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setT("abc");
        Box<Student> studentBox = new Box<>();
        studentBox.setT(new Student());

        Stack<Integer> stacks = new Stack<>();
        stacks.push(10);
        stacks.push(20);
        stacks.push(30);
        stacks.push(40);
//        System.out.println(stacks);
//        System.out.println(stacks.pop());
//        System.out.println(stacks);
//        System.out.println(stacks.peek());
//        System.out.println(stacks);
//        int size = stacks.size();
//        for (int i = 0; i <size ; i++) {
//            System.out.println(stacks.pop());
//        }
//        while (!stacks.isEmpty()){
//            System.out.println(stacks.pop());
//        }

        Queue<Integer> queue = new ArrayDeque<>(2);
        queue.offer(1);
        queue.add(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
        System.out.println("kết thúc");

    }
}

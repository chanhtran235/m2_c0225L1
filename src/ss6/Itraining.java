package ss6;

public interface Itraining {
    final int A=10;
    void attendance();
    default void method1(){
        System.out.println("ok");
    }
}

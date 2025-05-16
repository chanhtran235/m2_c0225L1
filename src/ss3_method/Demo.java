package ss3_method;

public class Demo {
    public static void main(String[] args) {
     sum(10,2);
    }
    public static double sum(double a, int b){
        double s = a+b;
        System.out.println("sum1 chạy");
        return a+b;
    }
    // nạp chồng method sum
    public static int sum(int a, int b){
        System.out.println("sum1 chạy");
        return a+b;
    }
    // nạp chồng method sum
    public static double sum(int a,int b,int c){
        return  a+b+c;
    }
}

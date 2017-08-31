/**
 * Created by 17032361 on 2017/8/31.
 * 方法的重载
 * 是指一个类中可以定义有相同的名字，但参数不同的多个方法，调用时会根据不同的参数列表选择对应的方法。
 */

class student{
    public void max(int a,int b){
        System.out.println(a>b?a:b);  //三元运算符
    }

    public void max(double a,double b){
        System.out.println(a>b?a:b);
    }

    public void max(double a,double b,double c){
        double max = a>b?a:b;
        System.out.println(max>c?max:c);
    }
}
public class chapter6_13 {
    public static void main(String[] args){
        student one = new student();
        one.max(7.4,9.5);
        one.max(7.4,9.5,9.76);
    }
}

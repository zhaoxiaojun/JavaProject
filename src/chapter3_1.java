/**
 * Created by 17032361 on 2017/8/7.
 * 关系运算符
 */
public class chapter3_1 {
    public static void main(String[] args){
        int radius = 10;
        double high = 1.9;
        int value = (int)(3.14 * radius * radius * high);
        System.out.println(value);

        int A = 45;
        int B = 78;
        int t=A;
        A = B;
        B = t;
        System.out.println("A的值为"+A);
        System.out.println("B的值为"+B);
    }
}

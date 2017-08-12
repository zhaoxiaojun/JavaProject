import java.util.Scanner;

/**
 * Created by 17032361 on 2017/8/7.
 * 数据的输入
 */
public class chapter2_9 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = a.next();
        System.out.println("请输入你的年龄：");
        int age = a.nextInt();
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
    }
}

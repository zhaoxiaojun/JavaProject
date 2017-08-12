import java.util.Scanner;
/**
 * Created by 17032361 on 2017/8/7.
 * 逻辑运算符
 * &&  仅仅两个条件同时为真，结果为真；
 * ||  只要两个条件有一个为真，结果为真；
 * ! 条件为真时，结果为假；条件为假时，结果为真。
 */
public class chapter3_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你的java成绩：");
        int java=in.nextInt();
        System.out.println("请输入你的SQL成绩：");
        int sql = in.nextInt();
        if(!(java>90 && sql>90)){
            System.out.println("给你一本独孤九剑。");
        }
        System.out.println("测试");
    }
}

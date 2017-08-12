import java.util.Scanner;

/**
 * Created by 17032361 on 2017/8/7.
 * if条件语句的使用
 */
public class chapter3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int score = in.nextInt();
        if (score > 90 == false) {
            System.out.println("奖励你一根棒棒糖！");
        }
        System.out.println("正在测试...");
    }
}

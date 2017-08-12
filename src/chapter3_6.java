import java.util.Scanner;

/**
 * Created by 17032361 on 2017/8/7.
 * else分支
 */
public class chapter3_6 {
    public static void main(String[] args){
        System.out.println("请输入你的成绩：");
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        if (score>90){
            System.out.println("奖励你一根棒棒糖");
        }
        else if(score==90){
            System.out.println("革命尚未成功，继续努力加油");
        }
        else{
            System.out.println("面壁思过");
        }
    }
}

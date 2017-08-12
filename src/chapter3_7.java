import java.util.*;

/**
 * Created by 17032361 on 2017/8/8.
 * 多重if结构
 */
public class chapter3_7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int score = in.nextInt();
        if (score>=90){
            System.out.println("优秀");
        }
        else if(score>=80 && score<90){
            System.out.println("良好");
        }
        else if (score>=70 && score<80){
            System.out.println("中");
        }
        else{
            System.out.println("差");
        }
    }
}

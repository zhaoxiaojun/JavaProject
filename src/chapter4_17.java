import javax.swing.text.Style;
import java.util.Scanner;
/**
 * Created by 17032361 on 2017/8/14.
 */
public class chapter4_17 {
    public static void main(String[] args){
       /* System.out.println("请输入游戏关卡");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        switch (i){
            case 1:
                System.out.println("这是一个游戏1");
                break;

            case 2:
                System.out.println("这是一个游戏2");
                break;

            default:
                System.out.println("进入游戏失败！");
        */
        Scanner in = new Scanner(System.in);
        for (;;){
            System.out.println("还跑吗？");
            String flag = in.next();
            if (flag.equals("yes")){
                    System.out.println("那你继续");
                }else{
                break;
            }
        }
    }
}

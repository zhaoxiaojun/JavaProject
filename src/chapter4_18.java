import java.util.*;
/**
 * Created by Administrator on 2017/8/14.
 */
public class chapter4_18 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("请输入你的密码：");
            int password = in.nextInt();
            if (password != 123456){
                continue;
            }else{
                break;
            }
        }
        System.out.println("密码正确");
    }
}

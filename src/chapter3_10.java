import java.util.Scanner;
/**
 * Created by Administrator on 2017/8/8.
 */
public class chapter3_10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入整数.");
        int number = in.nextInt();
        if (number==0){
            System.out.println("请不要输入0好吗");
        }else{
            if(number%2==0){
                System.out.println(number+"它是一个偶数.");
            }else {
                System.out.println(number+"它是一个奇数.");
            }
        }
    }
}

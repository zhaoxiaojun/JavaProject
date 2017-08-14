import java.util.Scanner;
/**
 * Created by 17032361 on 2017/8/14.
 */
public class chapter4_16 {
    public static void main(String[] args){
        System.out.println("请输入一个整数：");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for (int i= 0,j = number;i<=j;i++,j--){
            System.out.println(i+"+"+j+"="+(i+j));
        }
    }
}

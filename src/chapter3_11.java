import java.util.Scanner;

/**
 * Created by 17032361 on 2017/8/8.
 * 判断闰年
 */
public class chapter3_11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = in.nextInt();
        if (year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+"年是瑞年！");
        }else{
            System.out.println(year+"年是平年！");
        }
    }
}

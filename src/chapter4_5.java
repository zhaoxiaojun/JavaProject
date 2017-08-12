import java.util.Scanner;
/**
 * Created by Administrator on 2017/8/10.
 * 求学员的平均数
 */
public class chapter4_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入学生的人数");
        int person=in.nextInt();
        int i = 1;
        int sum=0;
        while(i<=person){
            System.out.println("请输入"+i+"学员的成绩");
            int a=in.nextInt();
            sum=sum+a;
            i++;
        }
        int avg=sum/person;
        System.out.println(person+"个人的平均成绩为:"+avg);
    }
}

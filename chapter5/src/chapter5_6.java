import java.util.Scanner;
/**
 * Created by Administrator on 2017/8/20.
 */
public class chapter5_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"学生的成绩");
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        System.out.println("5个学生的平均分为"+sum/5);
    }
}

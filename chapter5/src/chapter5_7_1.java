import java.util.Scanner;
/**
 * Created by 17032361 on 2017/8/21.
 * 求考试成绩最高分
 */
public class chapter5_7_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"的学生的成绩");
            arr[i] = in.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("学生的的成绩最大是"+max);
    }
}

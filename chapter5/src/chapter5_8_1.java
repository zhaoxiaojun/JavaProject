import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by 17032361 on 2017/8/21.
 * 数组排序(升序)
 */
public class chapter5_8_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"个学生的成绩");
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

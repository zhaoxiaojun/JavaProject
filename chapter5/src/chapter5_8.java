import java.util.Scanner;
/**
 * Created by 17032361 on 2017/8/21.
 * 求最小值
 */
public class chapter5_8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[] = new int[4];
        for(int i = 0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"店的价格");
            arr[i] = in.nextInt();
        }
        int price = arr[0];
        for (int i=0;i<arr.length;i++){
            if(price>arr[i]){
                price = arr[i];
            }
        }
        System.out.println("最低价格为"+price);
    }
}

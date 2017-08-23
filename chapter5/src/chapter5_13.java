/**
 * Created by Administrator on 2017/8/23.
 * 数组冒泡排序
 * 从大到小  与   从小到大  进行冒泡排序
 */
public class chapter5_13 {
    public static void main(String[] args){
        int[] arr = {23,12,45,24,87,12,14,12};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

/**
 * Created by Administrator on 2017/8/23.
 * 插入----> 冒泡 -----> 选择
 * 效率越来越高
 */
public class chapter5_14 {
    public static void main(String[] args) {
        int[] arr = {34, 54, 6, 78, 87, 98, 53, 3421, 1, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

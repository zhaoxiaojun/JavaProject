/**
 * Created by Administrator on 2017/8/17.
 * chapter5_2 认识数组
 * 数组的基本用法
 * 会运用数组解决简单的问题
 */
public class chapter5_2 {
    public static void main(String[] args){
        int[] arr;
        arr = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        System.out.println(arr[2]);


        int arr1[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i=0;i<=arr1.length-1;i++){
            System.out.println(arr1[i]);
        }

    }
}

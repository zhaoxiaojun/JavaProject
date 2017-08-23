/**
 * Created by Administrator on 2017/8/23.
 * 数组的算法
 * 1、数组的复制
 * 2、查找算法
 * 3、插入算法
 * 4、冒泡算法
 * 5、选择算法
 *
 * today  is  copy array
 */
public class chapter5_10 {
    public static void main(String[] args){
        int[] arrA = {1,2,3,4,5,6,7,8,9};
        System.out.println(arrA);
        int[] arrB = new int[arrA.length];
        for(int i=0;i<arrA.length;i++){
            arrB[i] = arrA[i];
        }
        for(int i =0;i<arrA.length;i++){
            System.out.println(arrB[i]);
        }
    }
}

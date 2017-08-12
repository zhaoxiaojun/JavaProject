/**
 * Created by Administrator on 2017/8/10.
 * 1+2+3+4+5+...+100=?
 */
public class chapter4_4 {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        while(i<=100){
            sum=sum+i;
            i++;
        }
        System.out.println("结果为："+sum);
    }
}

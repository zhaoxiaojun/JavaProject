import java.util.*;
/**
 * Created by Administrator on 2017/8/10.
 */
public class chapter4_8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random MyRandom = new Random();
        int A = MyRandom.nextInt(101);
        int number;
        do{
            System.out.println("请猜一下电脑随机生成的数：");
            number = in.nextInt();
            if(number<A){
                System.out.println("小了");
            }else{
                System.out.println("大了");
            }
        }while(number!=A);
        System.out.println("恭喜你猜对了！");
    }
}

import java.util.Scanner;
/**
 * Created by Adolph on 2017/8/11.
 */
public class debugtest2 {
    public static void main(String[] args){
        System.out.println("请输入一个整数：");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        while(number!=0){
            int values = number%10;
            System.out.println(values);
            number = number/10;
        }
        System.out.println("程序被颠倒");
    }
}

import java.util.Scanner;

/**
 * Created by 17032361 on 2017/8/8.
 * if嵌套结构
 */
public class chapter3_8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请问你的性别是什么？(男/女)");
        String sex=in.next();
        if(sex.equals("男")){
            System.out.println("你的年龄是多少？");
            int age = in.nextInt();
            if(age>=18){
                System.out.println("成年啦");
            }else{
                System.out.println("还是个未成年");
            }
        }else{
            System.out.println("原来是个女生啊！");
        }
    }
}

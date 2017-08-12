/**
 * Created by 17032361 on 2017/8/7.
 * 认识% 取模(取余)
 */
public class chapter2_6 {
    public static void main(String[] args){
        int days = 46;
        int weeks = days/7;
        System.out.println("有"+weeks+"周");
        int days1 = days%7;
        System.out.println("剩余"+days1+"天");
    }
}

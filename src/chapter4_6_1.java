/**
 * Created by Administrator on 2017/8/10.
 */
public class chapter4_6_1 {
    public static void main(String[] args){
        int year = 2006;
        int i = 80000;
        while(i<=200000){
            i = i+(i/100*25);
            year++;
        }
        System.out.println(year+"年将达到20万人");
    }
}

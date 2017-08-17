/**
 * Created by Administrator on 2017/8/16.
 * 1900年1月1日---2012年9月2日
 * 到现在一共有多少天数  对7进行取模  结果就为星期几
 */
public class chapter4_23 {
    public static void main(String[] args){
        int sum = 0;
        for(int year=1900;year<=2011;year++){
            if (year%4==0&&year%100!=0||year%400==0){
                sum+=366;
            }else{
                sum+=365;
            }
        }
        for(int month=1;month<=8;month++){
            if(month==2){
                if(2012%400==0||2012%4==0&&2012%100!=0){
                    sum+=29;
                }else{
                    sum+=28;
                }
            }else{
                if(month==4||month==6||month==9||month==11){
                    sum+=30;
                }else{
                    sum+=31;
                }
            }
        }
        sum+=3;
        System.out.println("2012年9月1日为星期"+sum%7);
    }
}

/**
 * Created by Administrator on 2017/8/16.
 * 判断月份
 */
public class chapter4_22 {
    public static void main(String[] args){
        int sum = 0;
        for (int year=1900;year<=2015;year++){
            if(year%4==0&&year%100!=0||year%400==0){
                sum+=366;
            }else{
                sum+=365;
            }
        }
        for(int month=1;month<=4;month++){
            if(month==2){
                if(2016%4==0&&2016%100!=0||2016%400==0){
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
        sum+=7;
        System.out.println("1900年1月1日到2016年5月7日,一共"+sum+"天");
    }
}

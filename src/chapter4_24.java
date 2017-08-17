/**
 * Created by Administrator on 2017/8/16.
 */
public class chapter4_24 {
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
        sum+=1;
        int weekday = sum%7;
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        for(int i=1;i<=weekday;i++){
            System.out.print("\t");
        }
    }
}


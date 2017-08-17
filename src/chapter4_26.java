import java.util.Scanner;
/**
 * Created by Administrator on 2017/8/16.
 */
public class chapter4_26 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = in.nextInt();
        System.out.println("请输入月份：");
        int month = in.nextInt();
        int sum = 0;
        for(int i=1900;i<=year-1;year++){
            if (i%4==0&&i%100!=0||i%400==0){
                sum+=366;
            }else{
                sum+=365;
            }
        }
        for(int i=1;i<=month-1;month++){
            if(month==2){
                if(year%4==0&&year%100!=0||year%400==0){
                    sum+=29;
                }else{
                    sum+=28;
                }
            }else{
                if(i==4||i==6||i==9||i==11){
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
        for(int i=1;i<=30;i++){
            if(sum%7==6){
                System.out.print(i+"\n");
            }else{
                System.out.print(i+"\t");
            }
            sum++;
        }
    }
}
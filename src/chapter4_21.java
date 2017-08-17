/**
 * Created by Administrator on 2017/8/15.
判断瑞年
 计算1900到2016年有多少天
 */
//public class chapter4_21 {
//    public static void main(String[] args){
//        int sum = 0;
//        for(int year=1900;year<=2015;year++){
//            if(year%4==0&&year%100!=0||year%400==0){
//                sum+=366;
//            }else{
//                sum+=365;
//            }
//        }
//        System.out.println("1900年到2016年相隔"+sum+"天");
//
//    }
//}

public class chapter4_21{
    public static void main(String[] args){
        int sum = 0;
        int year = 1900;
        while(year<=2015){
            if(year%400==0){
                sum+=366;
            }else{
                sum+=365;
            }
            year++;
        }
        System.out.println("1990年到2015年相隔"+sum+"天");
    }
}
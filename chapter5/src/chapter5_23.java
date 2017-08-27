import java.util.*;
/**
 * Created by Adolph on 2017/8/27.
 * 班级学生成绩管理二
 */
public class chapter5_23 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入学生的人数：");
        int renshu = in.nextInt(); //定义学生的人数
        System.out.println("请输入课程的数目：");
        int courcsNum = in.nextInt(); //存储课程的数目
        String[] name = new String[renshu]; //声明一个string数组用来存储学生的姓名
        String[] courcs = new String[courcsNum]; //声明一个string数组用来存储课程的名称
        int[][] number = new int[renshu][courcsNum];
        int[] sum = new int[renshu];
        int[] average = new int[renshu];
        String[] str = new String[renshu];
        /*
        * 用来循环存储课程的名字
        * */
        for(int i = 0;i<courcs.length;i++){
            System.out.println("请定义第"+(i+1)+"门课程的名字");
            courcs[i] = in.next();
        }
        /*
        * 用来存储学生的各科成绩
        * */
        for (int i=0;i<renshu;i++){
            int S = 0;
            System.out.println("请输入第"+(i+1)+"个学生的姓名：");
            name[i] = in.next(); //用来存储学生的姓名
            String str11="";
            for(int j=0;j<courcsNum;j++){
                System.out.println("请输入学生"+name[i]+courcs[j]+"的成绩:");
                number[i][j] = in.nextInt(); //用来存储特定学生的特定成绩
                S+=number[i][j];
                str11+=number[i][j]+"\t";
            }
            sum[i]=S;
            average[i]=S/courcsNum;
            str[i] = name[i]+"\t"+str11+sum[i]+"\t"+average[i];
        }
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum.length-1;j++){
                if(sum[j]<sum[j+1]){
                    int t1 = sum[j+1];  String t2 = str[j];
                    sum[j] = sum[j+1];  str[j] = str[j+1];
                    sum[j+1] = t1;      str[j+1] = t2;
                }
            }
        }
        /*
        * 效果输出
        * */
        System.out.print("学生");
        for(int i=0;i<courcs.length;i++){
            System.out.print("\t"+courcs[i]);
        }
        System.out.print("\t总分\t平均分\t排行榜");
        System.out.println();
        for (int i = 0;i<renshu;i++){
            System.out.println(str[i]+"\t第"+(i+1));
        }
    }
}

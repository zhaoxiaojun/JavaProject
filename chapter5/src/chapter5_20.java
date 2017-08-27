import java.util.*;
/**
 * Created by Adolph on 2017/8/27.
 * 班级学生成绩管理二
 */
public class chapter5_20 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入学生的人数：");
        int renshu = in.nextInt(); //定义学生的人数
        System.out.println("请输入课程的数目：");
        int courcsNum = in.nextInt(); //存储课程的数目
        String[] name = new String[renshu]; //声明一个string数组用来存储学生的姓名
        String[] courcs = new String[courcsNum]; //声明一个string数组用来存储课程的名称
        int[][] number = new int[renshu][courcsNum];
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
            System.out.println("请输入第"+(i+1)+"个学生的姓名：");
            name[i] = in.next();
            for(int j=0;j<courcsNum;j++){
                System.out.println("请输入学生"+name[i]+courcs[j]+"的成绩:");
                number[i][j] = in.nextInt();

            }
        }
    }
}

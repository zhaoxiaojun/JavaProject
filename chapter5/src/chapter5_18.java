import java.util.*;
/**
 * Created by Adolph on 2017/8/27.
 * 班级学生成绩管理一
 */
public class chapter5_18 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入学生的人数：");
        int renshu = in.nextInt();
        System.out.println("请输入课程的数目");
        int courcsNum = in.nextInt();
        String[] names = new String[renshu];
        String[] courcs = new String[courcsNum];
        for(int i = 0;i<courcs.length;i++){
            System.out.println("请定义第"+(i+1)+"门课程的名字");
            courcs[i] = in.next();
        }
    }
}

/**
 * Created by 17032361 on 2017/9/14.
 */
public class Text {
    public static void main(String[] args){
        Student stu = new Student();
        stu.setNo(0);
        stu.setName("小李");
        stu.setAge(19);
        stu.setJava(80);
        stu.setC_shar(90);
        stu.setHtml(95);
        stu.setSql(98);
        stu.setSum();
        stu.setAvg();
        stu.toString();
        System.out.println("\t编号\t姓名\t年龄\tjava\tC#\thtml\tsql\t总分\t平均分");
        System.out.println(stu);


    }
}

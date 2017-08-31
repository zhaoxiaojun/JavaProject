/**
 * Created by 17032361 on 2017/8/31.
 * 封装
 * 继承
 * 多态
 *
 * 封装：就是把不想或者不该告诉别人的东西隐藏起来，把可以告诉别人的公开
 *
 * 做法：修改属性的访问权限来限制对属性的访问。并为每一个属性创建一对取值
 * 方法和赋值方法，用于对这些属性的访问
 */
class Student{
    private String name;
    private int age;
    private char gender;

    public void setGender(char gender){
        if(gender=='男'||gender=='女'){
        this.gender = gender;
        }else{
            System.out.println("请输入正确的性别！");
        }
    }

    public char getGender(){
        return this.gender;
    }
}
public class chapter6_12 {
    public static void main(String[] args){
        Student one = new Student();
        one.setGender('a');
        char gender = one.getGender();
        System.out.println(gender);
    }
}

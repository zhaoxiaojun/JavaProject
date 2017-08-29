/**
 * Created by Administrator on 2017/8/29.
 */
public class chapter6_4 {
    public static void main(String[] args){
        Person MyPerson = new Person();
        MyPerson.name = "小明同学";
        MyPerson.age = 19;
        MyPerson.gender = "男";
        System.out.println(MyPerson.name);
        System.out.println(MyPerson.age);
        System.out.println(MyPerson.gender);
        MyPerson.eat();
    }
}

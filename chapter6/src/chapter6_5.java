/**
 * Created by Administrator on 2017/8/29.
 */
public class chapter6_5 {
    public static void main(String[] args){
        Person One = new Person();
        One.age = 23;

        Person Two = new Person();
        Two.age = 12;
        System.out.println(Two.age);
        System.out.println(One.age);
        One.eat();
        Two.eat();
    }
}

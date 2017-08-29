/**
 * Created by Administrator on 2017/8/29.
 */
public class Person {
    String name;
    String gender;
    int age;

    /**
     * 无参无返回
     */
    public void eat() {
        System.out.println("我在吃饭");
    }

    /*
    * 有参无返回
    * */
    public void sleep(String A) {
        System.out.println("我在" + A + "睡觉");
    }

    /*
    * 有参有返回
    * */
    public int getAge(int a) {
        return a;
    }
}

/**
 * Created by 17032361 on 2017/8/31.
 * 构造方法
 * *使用new + 构造方法 创建一个新的对象；
 * *构造函数是定义在java类中的一个用来初始化对象的函数
 * *构造函数与类同名且没有返回值
 */
class Cat{
    private String name;
    private int age;
    //构造方法
    Cat (String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("姓名"+this.name +";" + "年龄"+this.age);
    }
    //普通方法
    void get(){
        System.out.println("我是一个普通方法");
    }
}


public class chapter6_14 {
    public static void main(String[] args){
        Cat one = new Cat("小花",12);
        one.get();
    }
}

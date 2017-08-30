/**
 * Created by 17032361 on 2017/8/30.
 */
class Dog {
    String name;
    public String print(String n){
        System.out.println(n);
        return n;
    }
}

public class chapter6_9{
    public static void main(String[] args){
        Dog A = new Dog();
        A.print("小明");
    }
}

/**
 * Created by 17032361 on 2017/9/14.
 */
public class Student {
    private int no;
    private String name;
    private int age;
    private int java;
    private int c_shar;
    private int html;
    private int sql;
    private int sum;
    private int avg;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getC_shar() {
        return c_shar;
    }

    public void setC_shar(int c_shar) {
        this.c_shar = c_shar;
    }

    public int getHtml() {
        return html;
    }

    public void setHtml(int html) {
        this.html = html;
    }

    public int getSql() {
        return sql;
    }

    public void setSql(int sql) {
        this.sql = sql;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public String toString(){
        String msg = "\t" + this.no + "\t" + this.name + "\t" +this.age + "\t" +this.java + "\t"
                + this.c_shar + "\t" + this.html + "\t" + this.sql + "\t" + this.sum + "\t" + this.avg;
        return msg;
    }

}

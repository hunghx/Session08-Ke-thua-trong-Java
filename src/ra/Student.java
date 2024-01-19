package ra;

import java.util.Arrays;
import java.util.List;

public class Student extends Person{

    private int age;
    private double dtb;
//    public Student(int id, String name, boolean sex, int age, double dtb){
//        // pha gọi super() ở đầu phương thức
//        super(id,name,sex);
//        this.age=age;
//        this.dtb=dtb;
//    }

    public Student(int id, String name, boolean sex, int age, double dtb) {
        super(id, name, sex);
        this.age = age;
        this.dtb = dtb;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    @Override
    public String toString() {
        return super.toString()+" ("+dtb+")"+" ("+age+")";
    }

    @Override
    public void displayName(final String name) {
        super.displayName(name); // super sẽ goi đến tham chiếu của lớp cha
    }

}


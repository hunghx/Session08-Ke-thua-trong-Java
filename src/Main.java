import ra.Person;
import ra.Student;
import ra.Teacher;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1,"Hung",true,19,10);
        System.out.println(s1.getName());

        // tính đa hinh
        Person person = new Student(2,"nam",true,20,9.5);
        System.out.println(person);
        person.displayName("hùng");

        // kiểu khai báo
        // kiểu thực tế

        // ép kiểu : sup -> sub : ép kiểu tuong minh
        if (person instanceof Student) {
            Student student = (Student) person; // kiểu thuc te của person là Student
        System.out.println(student.getAge());
//            System.out.println(student.getLevel());
//        System.out.println(student.getDtb());
        }

        // ép kiêu : sub-> sup  : ép kểu ngan dinh
        Person p1 = s1;
        // tu khóa final : khai báo hăng

    }
}
package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher mellisa = new Teacher(2,"Mellisa",700);
        Teacher vanderhorn = new Teacher(3,"Vanderhorn",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        Student tamasah = new Student(1,"Tamasha",4);
        Student manoj =  new Student(2,"Manoj",12);
        Student laxmi = new Student(3,"Laxmi",10);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasah);
        studentList.add(manoj);
        studentList.add(laxmi);

        School ghs = new School(teacherList,studentList);

        tamasah.paysFees(5000);
        manoj.paysFees(6000);
        System.out.println("GHS has earned $ "+ ghs.getTotalMoneyEarned());

        System.out.println("--------MAKING SCHOOL PAYS SALARY TO THE TEACHER----------");
        lizzy.recieveSalary(lizzy.getSalary());
        System.out.println("GHS has spent salary to " + lizzy.getName() +
                " and now has " + ghs.getTotalMoneyEarned());

        vanderhorn.recieveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent salary to " + vanderhorn.getName() + " " + vanderhorn.getSalary() +
                " and now has " + ghs.getTotalMoneyEarned());

        System.out.println(manoj);
        System.out.println(lizzy);



    }
}

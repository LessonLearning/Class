package school.management.system;

import java.util.List;

/**
 * Many teachers, many Students
 * Implements teacher and students using an arrayList
 */

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new object of school is created
     * @param teachers list of teachers in school
     * @param students list of students in school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent =0;
    }

    /**
     *
     * @return the list of the teachers in the school
     */

    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher for the school
     * @param teacher the teacher to be added
     */

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);

    }

    /**
     *
     * @return the list of students in school
     */

    public List<Student> getStudents() {
        return students;
    }

    /**
     * Add a student for the school
     * @param student the student to be add
     */

    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school
     */

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school
     * @param moneyEarned the money supposed to be added
     */

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return the total money spent by the school
     */

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Adds the total money spent by the school which
     * is the salary given by the school to the teacher
     * @param moneySpent the money supposed to be spent
     */

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
    }
}

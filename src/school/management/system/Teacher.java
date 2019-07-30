package school.management.system;

/**
 * This class is responsible of keep track of teacher'name,id and salary
 */

public class Teacher {
    public int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new teacher object
     * @param id id for the teacher
     * @param name name for the teacher
     * @param salary salary for the teacher
     */
    public Teacher(int id,String name,int salary){
        this.id=id;
        this.name= name;
        this.salary= salary;
        this.salaryEarned=0;

    }

    /**
     *
     * @return return id for the teacher
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return return name for the teacher
     */

    public String getName(){
        return name;
    }

    /**
     *
     * @return return salary for the teacher
     */
    public int getSalary(){
        return salary;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary=salary;

    }

    /**
     * Adds to the salary
     * removes from the total money earned by the school
     * @param salary
     */
    public void recieveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);

    }

    @Override
    public String toString() {
        return "Name of the teacher : " + name + " total salary earned " + salaryEarned;
    }
}

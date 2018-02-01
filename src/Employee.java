public class Employee extends Person {
    private int salary;

    public Employee(String firstName, String lastName, int salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public Employee() {

    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    void info() {

        super.info();
        System.out.println(" Wynagrodzenie: " + getSalary());
    }

    int totalSalary() {
        return getSalary();

    }

}



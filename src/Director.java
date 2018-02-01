public class Director extends Employee {

   private int bonus;

    public Director(String firstName, String lastName, int salary, int bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    public Director(int bonus) {

    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    void info() {

        super.info();
        System.out.println(" Wynagrodzenie: "+getSalary()+" Premia: "+getBonus());
    }

    int totalSalary(){
        return getSalary()+getBonus();

    }

}

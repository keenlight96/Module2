import java.io.Serializable;

public class AdministrativeEmployee extends Employee implements Serializable {
    private int daysOff;

    public AdministrativeEmployee(String name, int age, int days, int daysOff) {
        super(name, age, days);
        setId(Employee.countId);
        this.daysOff = daysOff;
    }

    public int getDaysOff() {
        return daysOff;
    }

    public void setDaysOff(int daysOff) {
        this.daysOff = daysOff;
    }

    @Override
    public int calculateMonthlySalary() {
        setSalary(500 * (getDays() - getDaysOff()));
        return getSalary();
    }

    @Override
    public String toDataFormat() {
        return getId()+","+getName()+","+getAge()+","+getDays()+","+getDaysOff()+","+getSalary();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", days=" + getDays() +
                ", daysOff=" + getDaysOff() +
                '}';
    }
}

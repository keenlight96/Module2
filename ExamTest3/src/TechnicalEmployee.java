import java.io.Serializable;

public class TechnicalEmployee extends Employee implements Serializable {
    private int projects;

    public TechnicalEmployee(String name, int age, int days, int projects) {
        super(name, age, days);
        setId(Employee.countId);
        this.projects = projects;
    }

    public int getProjects() {
        return projects;
    }

    public void setProjects(int projects) {
        this.projects = projects;
    }

    @Override
    public int calculateMonthlySalary() {
        setSalary(500 * getDays() + 200 * getProjects());
        return getSalary();
    }
    @Override
    public String toDataFormat() {
        return getId()+","+getName()+","+getAge()+","+getDays()+","+getProjects()+","+getSalary();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", days=" + getDays() +
                ", projects=" + getProjects() +
                '}';
    }
}

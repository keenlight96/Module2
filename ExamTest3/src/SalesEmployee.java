import java.io.Serializable;

public class SalesEmployee extends Employee implements Serializable {
    private int sales;

    public SalesEmployee(String name, int age, int days, int sales) {
        super(name, age, days);
        setId(Employee.countId);
        this.sales = sales;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    @Override
    public int calculateMonthlySalary() {
        setSalary(300 * getDays() + 50 * getSales());
        return getSalary();
    }
    @Override
    public String toDataFormat() {
        return getId()+","+getName()+","+getAge()+","+getDays()+","+getSales()+","+getSalary();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", days=" + getDays() +
                ", sales=" + getSales() +
                '}';
    }
}

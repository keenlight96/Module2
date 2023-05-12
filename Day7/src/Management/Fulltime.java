package Management;

import java.util.Date;

public class Fulltime extends Employee{
    private double factorSalary;
    private int id;

    public Fulltime() {
    }

    public Fulltime(String name, String phone, Date birthday, double factorSalary) {
        super(name, phone, birthday);
        id = Employee.getGlobalId();
        this.factorSalary = factorSalary;
    }

    public double getFactorSalary() {
        return factorSalary;
    }

    public void setFactorSalary(double factorSalary) {
        this.factorSalary = factorSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public double salary() {
        return 3000000*factorSalary;
    }

    @Override
    public String toString(){
        return id+" : " + getName() + ", " + getPhone() + ", " + getBirthday() + ", Factor Salary: " + getFactorSalary();
    }
}


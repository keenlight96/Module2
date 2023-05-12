package Management;

import java.util.Date;

public class Parttime extends Employee {
    private int hourWorked;
    private int id;

    public Parttime() {
    }

    public Parttime(String name, String phone, Date birthday, int hourWorked) {
        super(name, phone, birthday);
        id = Employee.getGlobalId();
        this.hourWorked = hourWorked;
    }

    public int getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(int hourWorked) {
        this.hourWorked = hourWorked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public double salary() {
        return 30000 * hourWorked;
    }

    @Override
    public String toString() {
        return id + " : " + getName() + ", " + getPhone() + ", " + getBirthday() + ", Hour worked: " + getHourWorked();
    }
}

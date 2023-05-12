package Management;

import java.util.Date;

public abstract class Employee {
    public static int globalId = 0;
    private String name;
    private String phone;
    private Date birthday;

    public Employee() {
    }

    public Employee(String name, String phone, Date birthday) {
        globalId++;
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getGlobalId() {
        return globalId;
    }

    public static void setGlobalId(int globalId) {
        Employee.globalId = globalId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public abstract double salary();

    public abstract String toString();
}

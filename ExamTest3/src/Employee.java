import java.io.*;

public abstract class Employee implements Serializable {
    public static int countId = 0;
    private int id;
    private String name;
    private int age;
    private int salary;
    private int days;

    public Employee(String name, int age, int days) {
        loadCountID();
        ++countId;
        this.name = name;
        this.age = age;
        this.days = days;
        saveCountID();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public abstract int calculateMonthlySalary();

    public abstract String toDataFormat();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", days=" + days +
                '}';
    }

    public void loadCountID() {
        File file = new File("src/data/countID.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            countId = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void saveCountID() {
        File file = new File("src/data/countID.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(String.valueOf(countId));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

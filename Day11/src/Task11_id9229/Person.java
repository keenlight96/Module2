package Task11_id9229;

public class Person {
    private String name;
    private boolean gender;
    private String birthday;

    public Person() {
    }

    public Person(String name, boolean gender, String birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}

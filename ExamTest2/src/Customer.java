import java.util.ArrayList;

public class Customer {
    public static int countId = 0;
    private int id;
    private String name;
    private String phone;
    private int idVaccine = 0;
    ArrayList<Vaccine> vaccines = new ArrayList<>();

    public Customer(String name, String phone) {
        this.id = ++countId;
        this.name = name;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getIdVaccine() {
        return idVaccine;
    }

    public void setIdVaccine(int idVaccine) {
        this.idVaccine = idVaccine;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void vaccinate(Vaccine e) {
        vaccines.add(e);
    }

    public void showVaccineList() {
        for (Vaccine e :
                vaccines) {
            System.out.println(e);
        }
    }
}

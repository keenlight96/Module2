import java.util.Date;

public class Vaccine {
    private int id;
    private String name;
    private Date dateVaccine;
    private double price;
    private Date injectVaccine;

    public Vaccine(int id, String name, Date dateVaccine, double price, Date injectVaccine) {
        this.id = id;
        this.name = name;
        this.dateVaccine = dateVaccine;
        this.price = price;
        this.injectVaccine = injectVaccine;
    }

    @Override
    public String toString() {
        return "Vaccine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateVaccine=" + dateVaccine +
                ", price=" + price +
                ", injectVaccine=" + injectVaccine +
                '}';
    }
}

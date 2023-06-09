package Task4_id9240;

public class Product implements Comparable<Product>{
    public static int count = 0;
    private int id;
    private String name;
    private int price;

    public Product() {
        id = ++count;
    }

    public Product(String name, int price) {
        this.id = ++count;
        this.name = name;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public int compareTo(Product o) {
        return o.getPrice() - getPrice();
    }
}

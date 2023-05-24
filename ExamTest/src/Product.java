public class Product {
    private String id;
    private String name;
    private int price;
    private int quantity;
    private String description;

    public Product(String id, String name, int price, int quantity, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void printf() {
        System.out.printf("Product { " +
                "id = %-4s" +
                ",   name = %-15s" +
                ",   price = %10d" +
                ",   quantity = %5d" +
                ",   description = %-20s" +
                "}\n", id, name, price, quantity, description);

    }
}
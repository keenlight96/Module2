package Task1_id9171;

public class Square extends Rectangle{
    public Square() {
        width = 1;
        length = 1;
    }

    public Square(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setLength(double side) {
        width = side;
        length = side;
    }

    @Override
    public String toString() {
        return "A square with side = " + width + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Square obj = new Square(5);
        System.out.println(obj.toString());
    }
}

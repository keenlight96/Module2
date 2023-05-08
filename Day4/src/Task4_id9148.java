public class Task4_id9148 {
    public static void main(String[] args) {

        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setColor("Yellow");
        fan1.setRadius(10);
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}

class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int HARD = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    // getter
    public int getSpeed() {
        return speed;
    }
    public boolean getOn() {
        return on;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    // setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //
    public Fan() {
    }

    public String toString() {
        if (this.on)
            return "Fan is on.\nSpeed = " + this.speed+ ", Color = " + this.color + ", Radius = " + this.radius;
        else
            return "Fan is off.\nColor = " + this.color + ", Radius = " + this.radius;
    }
}

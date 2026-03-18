package hwss0804;

public class Rectangle {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return getHeight() * getWidth();
    }
    public double getPerimeter() {
        return 2 * (getHeight() + getWidth());
    }
    public String toString() {
        return "width=" + getWidth() + ", height=" + getHeight() + ", area=" + getArea() + ", perimeter=" + getPerimeter() + ")";
    }
}

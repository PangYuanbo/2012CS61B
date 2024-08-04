import java.util.Date;

abstract class GeometricObject1 implements Comparable<GeometricObject1> {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    public GeometricObject1() {
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    @Override
    public int compareTo(GeometricObject1 o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    public static GeometricObject1 max(GeometricObject1 o1, GeometricObject1 o2) {
        return (o1.compareTo(o2) > 0) ? o1 : o2;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}

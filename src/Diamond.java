import java.io.Serializable;

public class Diamond implements Serializable {
    private String shape;
    private double carat;
    private String cut;
    private String clarity;
    private String color;
    private double price;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public double getCarat() {
        return carat;
    }

    public void setCarat(double carat) {
        this.carat = carat;
    }

    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut;
    }

    public String getClarity() {
        return clarity;
    }

    public void setClarity(String clarity) {
        this.clarity = clarity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Diamond(String shape, double carat, String cut, String clarity, String color, double price) {
        this.shape = shape;
        this.carat = carat;
        this.cut = cut;
        this.clarity = clarity;
        this.color = color;
        this.price = price;
    }

    public Diamond() {
        this.shape = "";
        this.carat = 0.00;
        this.cut = "";
        this.clarity = "";
        this.color = "";
        this.price = 0.00;
    }
}


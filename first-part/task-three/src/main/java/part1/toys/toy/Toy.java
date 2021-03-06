package part1.toys.toy;

public abstract class Toy {

    private double price;
    private String name;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public Toy(String name, double price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;

    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

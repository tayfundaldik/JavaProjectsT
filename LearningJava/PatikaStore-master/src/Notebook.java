import java.util.*;
public class Notebook extends Store{
    private String name;
    private int id;
    private double price;
    private String brand;
    private int storage;
    private double screen;
    private int ram;

    public Notebook(String name,double price, String brand, int storage, double screen, int ram) {
        this.name  = name;
        this.price = price;
        this.brand = brand;
        this.storage = storage;
        this.screen = screen;
        this.ram = ram;
    }
    public Notebook(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


    public int compareTo(Notebook o) {
        if (this.id > o.id) {

            return 1;
        } else if (this.id < o.id) {


            return -1;
        } else {


            return 0;
        }
    }

}

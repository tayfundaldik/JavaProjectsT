public class MobilePhones extends Store{
    private String name;
    private int id;
    private double price;
    private String brand;
    private int storage;
    private double screen;
    private int cam;
    private double battery;
    private int ram;
    private String color;

    public MobilePhones(String name, double price, String brand, int storage, double screen, int cam, double battery, int ram, String color) {
        this.name= name;

        this.price = price;
        this.brand = brand;
        this.storage = storage;
        this.screen = screen;
        this.cam = cam;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
    }
    public MobilePhones(){
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

    public int getCam() {
        return cam;
    }

    public void setCam(int cam) {
        this.cam = cam;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int compareTo(MobilePhones o) {
        if (this.id > o.id) {
            return 1;
        } else if (this.id < o.id) {
            return -1;
        } else {

            return 0;
        }
    }
}

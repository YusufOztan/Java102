package PatikaStore;

public class Features {
    private int productId;
    private int price;
    private double sale;
    private int stock;
    private String productName;
    private PatikaStore brand;
    private int memory;
    private double screenSize;
    private int ram;

    public Features(){}
    public Features(int productId, int price, double sale, int stock, String productName, PatikaStore brand, int memory, double screenSize, int ram) {
        this.productId = productId;
        this.price = price;
        this.sale = sale;
        this.stock = stock;
        this.productName = productName;
        this.brand = brand;
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public PatikaStore getBrand() {
        return brand;
    }

    public void setBrand(PatikaStore brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

}

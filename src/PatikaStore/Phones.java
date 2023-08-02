package PatikaStore;

public class Phones extends Features{
    private int batteryCapacity;
    private int camera;
    private String color;

    public Phones(){}
    public Phones(int productId, int price, double sale, int stock, String productName, PatikaStore brand, int memory, double screenSize,int camera, int ram, int batteryCapacity, String color) {
        super(productId, price, sale, stock, productName, brand, memory, screenSize, ram);
        this.camera = camera;
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }
    public void run() {
        PatikaStore samsung = new PatikaStore(1, "Samsung");
        PatikaStore apple = new PatikaStore(3, "Apple");
        PatikaStore xiaomi = new PatikaStore(8, "Xiaomi");
        Phones phone1 = new Phones(5,3199,0,10,"SAMSUNG GALAXY A51",samsung,128,6.5,32,6,4000,"Black");
        Phones phone2 = new Phones(6,7379,0,8,"iPhone 11 64 GB  ",apple,64,6.1,5,6,3046,"Blue");
        Phones phone3 = new Phones(7,4012,0,15,"Redmi Note 10 Pro 8GB",xiaomi,128,6.5,35,6,4000,"White");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Prdocut Name                   | Price     | Brand     | Memory  | Screen     | Camera    | Battery       | RAM       | Color      | ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return String.format("| %2d | %-30s | %.1f TL | %-9s | %-7d | %-9.1f | %-9d | %-13d | %-9d | %-11s |",
                getProductId(), getProductName(), (double) getPrice(), getBrand().getBrandName(), getMemory(), getScreenSize(), getCamera(), getBatteryCapacity(), getRam(), getColor());
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

package PatikaStore;

import java.util.HashMap;
import java.util.Map;

public class PatikaStore implements Comparable<PatikaStore>{
    private int id;
    private String brandName;

    public PatikaStore(){}
    public PatikaStore(int id, String brandName) {
        this.id = id;
        this.brandName = brandName;
    }

    @Override
    public int compareTo(PatikaStore otherBrandName) {
        return this.brandName.compareTo(otherBrandName.getBrandName());
    }

    private static Map<Integer, String> brands = new HashMap<>();

    static {
        PatikaStore b1 = new PatikaStore(1,"Samsung");
        PatikaStore b2 = new PatikaStore(2,"Lenovo");
        PatikaStore b3 = new PatikaStore(3,"Apple");
        PatikaStore b4 = new PatikaStore(4,"Huawei");
        PatikaStore b5 = new PatikaStore(5,"Casper");
        PatikaStore b6 = new PatikaStore(6,"Asus");
        PatikaStore b7 = new PatikaStore(7,"HP");
        PatikaStore b8 = new PatikaStore(8,"Xiaomi");
        PatikaStore b9 = new PatikaStore(9,"Monster");

        brands.put(b1.getId(),b1.getBrandName());
        brands.put(b2.getId(),b2.getBrandName());
        brands.put(b3.getId(),b3.getBrandName());
        brands.put(b4.getId(),b4.getBrandName());
        brands.put(b5.getId(),b5.getBrandName());
        brands.put(b6.getId(),b6.getBrandName());
        brands.put(b7.getId(),b7.getBrandName());
        brands.put(b8.getId(),b8.getBrandName());
        brands.put(b9.getId(),b9.getBrandName());

    }
    public static void run(){
        System.out.println("Our Brands:");
        for (String brand : brands.values()) {
            System.out.println(brand);
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

}

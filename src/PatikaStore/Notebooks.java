package PatikaStore;

public class Notebooks extends Features{

    public Notebooks(){
        super();
    }
    public Notebooks(int productId, int price, double sale, int stock, String productName, PatikaStore brand, int memory, double screenSize, int ram) {
        super(productId, price, sale, stock, productName, brand, memory, screenSize, ram);
    }


    public void run() {
        PatikaStore huawei = new PatikaStore(4, "Huawei");
        PatikaStore lenovo = new PatikaStore(2, "Lenovo");
        PatikaStore asus = new PatikaStore(6, "Asus");
        Notebooks notebook1 = new Notebooks(1, 7000, 0, 10, "HUAWEI Matebook 14", huawei, 512, 14.0, 16);
        Notebooks notebook2 = new Notebooks(2, 3699, 0, 20, "LENOVO V14 IGL", lenovo, 1024, 14.0, 8);
        Notebooks notebook3 = new Notebooks(3, 8199, 0, 15, "ASUS Tuf Gaming", asus, 2048, 15.6, 32);
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Product Name                   | Price     | Brand     | Memory    | Screen    | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println(notebook1);
        System.out.println(notebook2);
        System.out.println(notebook3);
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public String toString() {
        return String.format("| %2d | %-30s | %.1f TL | %-9s | %-9d | %-9.1f | %-11d |",
                getProductId(), getProductName(), (double)getPrice(), getBrand().getBrandName(), getMemory(), getScreenSize(), getRam());
    }

}

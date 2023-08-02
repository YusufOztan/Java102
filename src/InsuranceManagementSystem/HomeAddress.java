package InsuranceManagementSystem;

public class HomeAddress implements Address{
    private String street;
    private String city;
    private String postalCode;

    // Implement methods for home address
    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    @Override
    public String toString() {
        return "Home Address: " + street + ", " + city + ", " + postalCode;
    }
}

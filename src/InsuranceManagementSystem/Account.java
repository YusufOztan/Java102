package InsuranceManagementSystem;

import java.util.ArrayList;
import java.util.Date;

public abstract class Account {

    private AuthenticationStatus loginStatus;
    private User user;
    private ArrayList<Insurance> insurances;

    public Account(User user) {
        this.loginStatus = AuthenticationStatus.FAIL;
        this.user = user;
        this.insurances = new ArrayList<>();
    }

    public enum AuthenticationStatus {
        SUCCESS, FAIL
    }

    public AuthenticationStatus getLoginStatus() {
        return loginStatus;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            loginStatus = AuthenticationStatus.SUCCESS;
            user.setLastLogin(new Date());
        } else {
            throw new InvalidAuthenticationException("Invalid email or password");
        }
    }

    public void addInsurance(Insurance insurance) {
        // Implement adding insurance for individual accounts
        insurances.add(insurance);
    }

    public final void showUserInfo() {
        System.out.println("Name: " + user.getName());
        System.out.println("Surname: " + user.getSurname());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Occupation: " + user.getJob());
        System.out.println("Age: " + user.getAge());
        System.out.println("Addresses: " + user.getAddresses().toString());
        System.out.println("Last login date: " + user.getLastLogin());
    }
}

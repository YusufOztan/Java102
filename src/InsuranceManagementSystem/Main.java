package InsuranceManagementSystem;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create sample users, addresses, and accounts
        User user1 = new User("John", "Doe", "john.doe@example.com", "password", "Engineer", 30, new ArrayList<>(), new Date());
        Address homeAddress = new HomeAddress();
        homeAddress.setStreet("123 Main Street");
        homeAddress.setCity("New York");
        homeAddress.setPostalCode("10001");
        AddressManager.addAddress(user1, homeAddress);
        Individual individualAccount = new Individual(user1);
        user1.setLastLogin(new Date());

        User user2 = new User("Jane", "Smith", "jane.smith@example.com", "password", "Doctor", 35,new ArrayList<>(), new Date());
        Address homeAddress2 = new HomeAddress();
        homeAddress2.setStreet("456 Business Avenue");
        homeAddress2.setCity("New York");
        homeAddress2.setPostalCode("20001");
        AddressManager.addAddress(user2, homeAddress2);
        Enterprise enterpriseAccount = new Enterprise(user2);
        user2.setLastLogin(new Date());

        AccountManager accountManager = new AccountManager();
        accountManager.addAccount(individualAccount);
        accountManager.addAccount(enterpriseAccount);

        //String email = "john.doe@example.com";
        //String password = "password";

        String email = "jane.smith@example.com";
        String password = "password";


        Account loggedInAccount = accountManager.login(email, password);
        if (loggedInAccount != null) {
            System.out.println("Login successful! User information:");
            loggedInAccount.showUserInfo();
        } else {
            System.out.println("Login failed. Invalid email or password.");
        }

    }
}

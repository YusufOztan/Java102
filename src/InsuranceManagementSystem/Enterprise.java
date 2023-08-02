package InsuranceManagementSystem;

public class Enterprise extends Account implements Comparable<Individual>{
    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        getInsurances().add(insurance);
    }

    @Override
    public int compareTo(Individual other) {
        // Implement Comparable interface method here if needed
        // Return -1, 0, or 1 based on the comparison logic
        // For example, you can compare users based on their names, emails, etc.
        // Return -1 if this is less than other, 0 if they are equal, and 1 if this is greater than other
        return this.getUser().getName().compareTo(other.getUser().getName());
    }
}

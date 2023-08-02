package InsuranceManagementSystem;

public class Individual extends Account implements Comparable<Individual>{
    public Individual(User user) {
        super(user);
    }
    @Override
    public void addInsurance(Insurance insurance) {
        getInsurances().add(insurance);
    }
    @Override
    public int compareTo(Individual other) {

        return this.getUser().getName().compareTo(other.getUser().getName());
    }

}

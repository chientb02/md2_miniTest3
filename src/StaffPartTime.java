public class StaffPartTime extends Staff {
    private double workingHours ;
    public StaffPartTime( String name, int age, String phoneNumber, String email, Address address, double workingHours) {
        super(name, age, phoneNumber, email, address);
        this.workingHours = workingHours;
    }
    public double getWorkingHours() {
        return workingHours;
    }

    @Override
    public String toString() {
        return "StaffPartTime{" +"id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", address=" + getAddress()+
        "workingHours=" + workingHours +
                '}';
    }
}

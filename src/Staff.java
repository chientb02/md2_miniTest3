public class Staff  {
    private static int idTempt = 1;
    private int id ;
    private String name ;
    private int age ;
    private String phoneNumber ;
    private String email ;

    private Address address;

    public Staff( String name, int age, String phoneNumber, String email, Address address) {
        this.id = idTempt;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        idTempt++ ;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public String getEmail() {
        return email;
    }


    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}

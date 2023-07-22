public class Address {
    private String provinceCity ;
    private String district ;
    private String wards ;
    private int apartmentNumber ;

    public Address(String provinceCity, String district, String wards, int apartmentNumber) {
        this.provinceCity = provinceCity;
        this.district = district;
        this.wards = wards;
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "provinceCity='" + provinceCity + '\'' +
                ", district='" + district + '\'' +
                ", wards='" + wards + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                '}';
    }
}

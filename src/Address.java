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

    public Address() {
    }

    public String getProvinceCity() {
        return provinceCity;
    }

    public void setProvinceCity(String provinceCity) {
        this.provinceCity = provinceCity;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWards() {
        return wards;
    }

    public void setWards(String wards) {
        this.wards = wards;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
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

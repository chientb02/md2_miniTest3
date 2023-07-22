public class StaffFullTime extends Staff {
        private double  bonus ;
        private double  forfeit ;
        private double hardSalary ;

        public StaffFullTime(String name, int age, String phoneNumber, String email, Address address, double bonus, double forfeit, double hardSalary) {
                super( name, age, phoneNumber, email, address);
                this.bonus = bonus;
                this.forfeit = forfeit;
                this.hardSalary = hardSalary;
        }
        public double getBonus() {
                return bonus;
        }
        public double getForfeit() {
                return forfeit;
        }


        public double getHardSalary() {
                return hardSalary;
        }
        @Override
        public String toString() {
                return "StaffFullTime{" +"id=" + getId() +
                        ", name='" + getName() + '\'' +
                        ", age=" + getAge() +
                        ", phoneNumber='" + getPhoneNumber() + '\'' +
                        ", email='" + getEmail() + '\'' +
                        ", address=" + getAddress() +
                        "bonus=" + bonus +
                        ", forfeit=" + forfeit +
                        ", hardSalary=" + hardSalary +
                        '}';
        }
}

public class Woman extends Person {
    private String registerPartnership;

    public Woman(String firstName, String lastName, int age, boolean partner) {
        super(firstName, lastName, age, partner);

    }

    public void registerPartner(Man partner) {
        this.registerPartnership = partner.getLastName();
    }

    public String getRegisterPartnership() {
        return registerPartnership;
    }

    @Override
    public String getLastName() {
        if (isPartner()) {
            return getRegisterPartnership();
        } else return super.getLastName();
    }

    public String deregisterPartnership() {
        if (!isPartner()) {
            return super.getLastName();
        } else return "Partner registered!";
    }

    public boolean isRetired() {
        return getAge() >= 60;
    }
}
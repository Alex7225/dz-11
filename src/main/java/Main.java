public class Main {
    public static void main(String[] args) {

        Woman wife = new Woman("Katya", "Polina", 59, true);
        Man husban = new Man("Vova", "Klan", 65, true);

        wife.registerPartner(husban);
        System.out.println(wife.getFirstName() + wife.getLastName());
        System.out.println("Partner:  " + wife.deregisterPartnership());
        System.out.println(wife.isRetired());
        System.out.println(husban.getFirstName());
        System.out.println(husban.isRetired());
    }
}
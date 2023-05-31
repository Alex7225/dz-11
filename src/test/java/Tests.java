import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {
    @Test
    public void testWomanPartner() {
        Woman wife = new Woman("Olga", "Prokopenko", 24, true);
        Man husban = new Man("Ivan", "Mukolaichyk", 29, true);
        wife.registerPartner(husban);

        Assert.assertEquals(wife.isPartner(), true, "Wrong");
    }

    @Test
    public void testWomanSurename() {
        Woman wife = new Woman("Olga", "Prokopenko", 24, true);
        Man husban = new Man("Ivan", "Mukolaichyk", 29, true);
        wife.registerPartner(husban);

        Assert.assertEquals(wife.getLastName(), "Mukolaichyk", "Not married!");
    }

    @Test
    public void testWomanName() {
        Woman wife = new Woman("Olga", "Prokopenko", 24, true);
        Man husban = new Man("Ivan", "Mukolaichyk", 29, true);
        wife.registerPartner(husban);

        Assert.assertEquals(wife.getFirstName(), "Olga", "No name");
    }

    @Test
    public void testWomanRetired() {
        Woman wife = new Woman("Olga", "Prokopenko", 24, true);
        Man husban = new Man("Ivan", "Mukolaichyk", 29, true);
        wife.registerPartner(husban);

        Assert.assertEquals(wife.isRetired(), false, "Pensoiner, maybe");
    }

    @Test
    public void testWomanAge() {
        Woman wife = new Woman("Olga", "Prokopenko", 24, true);
        Man husban = new Man("Ivan", "Mukolaichyk", 29, true);
        wife.registerPartner(husban);

        Assert.assertEquals(wife.getAge(), 24, "Old");
    }

    @Test
    public void testWomanGetPartner() {
        Woman wife = new Woman("Olga", "Prokopenko", 24, true);
        Man husban = new Man("Ivan", "Mukolaichyk", 29, true);
        wife.registerPartner(husban);

        Assert.assertEquals(wife.getRegisterPartnership(), "Mukolaichyk", "No pathner");
    }

    @Test
    public void testWomanPather() {
        Woman wife = new Woman("Olga", "Prokopenko", 24, true);
        Man husban = new Man("Ivan", "Mukolaichyk", 29, true);
        wife.registerPartner(husban);

        Assert.assertEquals(wife.deregisterPartnership(), "Partner registered!", "No pathner");
    }

    @Test
    public void testHusbenRetired() {
        Woman wife = new Woman("Olga", "Prokopenko", 24, true);
        Man husban = new Man("Ivan", "Mukolaichyk", 29, true);

        Assert.assertEquals(husban.isRetired(), false, "Pensoiner, maybe");
    }

    @Test
    public void testHusbenPartner() {
        Woman wife = new Woman("Olga", "Prokopenko", 24, true);
        Man husban = new Man("Ivan", "Mukolaichyk", 29, true);

        Assert.assertEquals(husban.isPartner(), true, "Wrong");
    }

    @Test
    public void testHusbenSurname() {
        Woman wife = new Woman("Olga", "Prokopenko", 24, true);
        Man husban = new Man("Ivan", "Mukolaichyk", 29, true);

        Assert.assertEquals(husban.getLastName(), "Mukolaichyk", "Not married!");
    }

    @Test
    public void testHusbenName() {
        Woman wife = new Woman("Olga", "Prokopenko", 24, true);
        Man husban = new Man("Ivan", "Mukolaichyk", 29, true);

        Assert.assertEquals(husban.getFirstName(), "Ivan", "No name");
    }

    @Test
    public void testHusbenAge() {
        Woman wife = new Woman("Olga", "Prokopenko", 24, true);
        Man husban = new Man("Ivan", "Mukolaichyk", 29, true);

        Assert.assertEquals(husban.getAge(), 29, "Old");
    }
}
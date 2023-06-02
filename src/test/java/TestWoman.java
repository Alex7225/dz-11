import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestWoman {

    private Woman wife;
    private Man husban;

    @BeforeTest(alwaysRun = true)
    public void creatingFamily() {
        wife = new Woman("Olga", "Prokopenko", 24, true);
        husban = new Man("Ivan", "Mukolaichyk", 29, true);
        wife.registerPartner(husban);
    }
    @Test (groups = {"All"})
    public void testWomanPartner() {
        Assert.assertTrue(wife.isPartner(), "Woman has no partner");
    }
    @Test (groups = {"All"})
    public void testWomanSurename() {
        Assert.assertEquals(wife.getLastName(), "Mukolaichyk", "No Partner or Surname didn't changed");
    }
    @Test(groups = {"GettersTest", "All"})
    public void testWomanName() {
        Assert.assertEquals(wife.getFirstName(), "Olga", "No name");
    }
    @Test (groups = {"All"})
    public void testWomanRetired() {
        Assert.assertFalse(wife.isRetired(), "Pensioner, maybe");
    }
    @Test (groups = {"All"})
    public void testWomanAge() {
        Assert.assertEquals(wife.getAge(), 24, "Old");
    }
    @Test(groups = {"GettersTest", "All"})
    public void testWomanGetPartner() {
        Assert.assertEquals(wife.getRegisterPartnership(), "Mukolaichyk", "No pathner");
    }
    @Test(groups = {"GettersTest", "All"})
    public void testWomanPather() {
        Assert.assertEquals(wife.deregisterPartnership(), "Partner registered!", "No pathner");
    }
}
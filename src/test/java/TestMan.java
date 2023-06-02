import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMan {

    private Woman wife;
    private Man husban;

    @BeforeTest(alwaysRun = true)
    public void creatingFamily() {
        wife = new Woman("Olga", "Prokopenko", 24, true);
        husban = new Man("Ivan", "Mukolaichyk", 29, true);
        wife.registerPartner(husban);
    }
    @Test (groups = {"All"})
    public void testHusbenRetired() {
        Assert.assertFalse(husban.isRetired(), "Pensioner, maybe");
    }
    @Test (groups = {"All"})
    public void testHusbenSurname() {
        Assert.assertEquals(husban.getLastName(), "Mukolaichyk", "No surname, maybe didn't store");
    }
    @Test(groups = {"GettersTest", "All"})
    public void testHusbenName() {
        Assert.assertEquals(husban.getFirstName(), "Ivan", "No name, maybe didn't store");
    }
    @Test(groups = {"GettersTest", "All"})
    public void testHusbenAge() {
        Assert.assertEquals(husban.getAge(), 29, "Wrong age, maybe didn't store");
    }
}
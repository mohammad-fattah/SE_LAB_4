import Abstract_Factory.Client;
import Abstract_Factory.Factories.IranianGardenCreator;
import Abstract_Factory.Factories.JapaneseGardenCreator;
import org.junit.Assert;
import org.junit.Test;

public class GardenTest {
    private Client client;

    @Test
    public void TestIranianGarden() {
        client = new Client(new IranianGardenCreator());
        Assert.assertEquals("Garden created with Chenar and Tulips", client.check());
    }

    @Test
    public void TestJapaneseGarden() {
        client = new Client(new JapaneseGardenCreator());
        Assert.assertEquals("Garden created with Japanese Maple and Cherry Blossom", client.check());
    }
}

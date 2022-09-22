import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMain {
    @Test
    public void testMain() {
        assertEquals("Thanks for attention!\tBay!", Main.sayGoodBay());
    }
}

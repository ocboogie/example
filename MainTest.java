import static org.junit.Assert.*;
import org.junit.*;

public class MainTest {
    @Test
    public void addTest() {
        assertEquals(3, Main.add(2, 1));
    }
}

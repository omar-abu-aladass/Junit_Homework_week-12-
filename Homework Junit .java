import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleClassTest {

    @Test
    public void testAddition() {
        SimpleClass obj = new SimpleClass();
        assertEquals(9, obj.addEm(2, 7));
    }

    @Test
    public void testSubtraction() {
        SimpleClass obj = new SimpleClass();
        assertEquals(0, obj.subEm(5, 5));
    }

    @Test
    public void testDivision() {
        SimpleClass obj = new SimpleClass();
        assertEquals(4.0, obj.divEm(8, 2));
    }
}
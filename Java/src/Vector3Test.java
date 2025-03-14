import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Vector3Test {
    @Test
    public void lenghtTest() {
        Vector3 v = new Vector3(3, 4, 5);
        assertEquals(7.07106, v.getLength(), 0.0001f);
        v = new Vector3(0, 0, 0);
        assertEquals(0, v.getLength(), 0.0001f);
    }
}

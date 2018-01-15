import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems(5, 0.80, 3.00, 8);
    }

    @Test
    public void hasPrice() {
        assertEquals(5, dodgems.getridePrice());
    }

    @Test
    public void hasMinHeight() {
        assertEquals(0.80, dodgems.getminHeight(), 0.01);
    }

    @Test
    public void hasMaxHeight() {
        assertEquals(3.00, dodgems.getmaxHeight(), 0.01);
    }

    @Test
    public void hasMinAge() {
        assertEquals(8, dodgems.getminAge());
    }
}

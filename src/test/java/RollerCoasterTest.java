import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster(20, 1.30, 2.30, 12);
    }

    @Test
    public void hasPrice() {
        assertEquals(20, rollerCoaster.getridePrice());
    }

    @Test
    public void hasMinHeight() {
        assertEquals(1.30, rollerCoaster.getminHeight(), 0.01);
    }

    @Test
    public void hasMaxHeight() {
        assertEquals(2.30, rollerCoaster.getmaxHeight(), 0.01);
    }

    @Test
    public void hasMinAge() {
        assertEquals(12, rollerCoaster.getminAge());
    }

}

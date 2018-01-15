import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster(20, 1.30, 2.30);
    }

    @Test
    public void hasPrice() {
        assertEquals(20, rollerCoaster.getridePrice());
    }

}
